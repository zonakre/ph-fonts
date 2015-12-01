/**
 * Copyright (C) 2014-2015 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.font.exo2;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import com.helger.font.api.IFontResource;
import com.helger.font.api.IFontResourceProviderSPI;

/**
 * The implementation of {@link IFontResourceProviderSPI} for this project.
 *
 * @author Philip Helger
 */
public final class FontResourceProviderSPI implements IFontResourceProviderSPI
{
  @Nonnull
  public Iterable <? extends IFontResource> getAllFontResources ()
  {
    final List <IFontResource> ret = new ArrayList <IFontResource> ();
    for (final EFontResource e : EFontResource.values ())
      ret.add (e.getFontResource ());
    return ret;
  }
}