/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.obsidian.generator.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
@ApplicationPath("/")
public class RestApplication extends Application
{
   @Override
   public Set<Class<?>> getClasses()
   {
      HashSet<Class<?>> classes = new HashSet<>();
      classes.add(ObsidianResource.class);
      return classes;
   }
}