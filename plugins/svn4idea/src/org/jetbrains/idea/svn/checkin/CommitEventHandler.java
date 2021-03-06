/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jetbrains.idea.svn.checkin;

import org.jetbrains.idea.svn.api.ProgressTracker;

import java.io.File;

/**
 * Used to listen to commit events to display progress to user
 *
 * User: Irina.Chernushina
 * Date: 2/26/13
 * Time: 10:12 AM
 */
public interface CommitEventHandler extends ProgressTracker {
  void commitEvent(final CommitEventType type, final File target);
  void committedRevision(final long revNum);
}
