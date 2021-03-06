/*
* Copyright 2015 Stormpath, Inc.
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
package com.stormpath.sdk.mail;

/**
 * The UnmodeledEmailTemplate is an {@link EmailTemplate} resource that will be sent to the user after the newly-created account has been successfully verified.
 * For example, this email can be used to notify the user about his admittance to start using your service as a fully registered user.
 *
 * @since 1.0.RC4.5
 */
public interface UnmodeledEmailTemplate extends EmailTemplate<UnmodeledEmailTemplate> {

}
