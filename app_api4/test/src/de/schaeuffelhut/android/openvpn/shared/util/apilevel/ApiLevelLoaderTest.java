/*
 * This file is part of OpenVPN-Settings.
 *
 * Copyright © 2009-2012  Friedrich Schäuffelhut
 *
 * OpenVPN-Settings is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * OpenVPN-Settings is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenVPN-Settings.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Report bugs or new features at: http://code.google.com/p/android-openvpn-settings/
 * Contact the author at:          android.openvpn@schaeuffelhut.de
 */

package de.schaeuffelhut.android.openvpn.shared.util.apilevel;

import junit.framework.TestCase;

/**
 * @author Friedrich Schäuffelhut
 * @since 2013-03-10
 */
public class ApiLevelLoaderTest extends TestCase
{
    public void test_load_ApiLevel3() throws Exception
    {
        assertTrue( ApiLevelLoader.loadAbstractionFor( 3 ) instanceof ApiLevel3 );
    }

    public void test_load_ApiLevel4() throws Exception
    {
        assertTrue( ApiLevelLoader.loadAbstractionFor( 4 ) instanceof ApiLevel3 );
    }

    public void test_load_ApiLevel9() throws Exception
    {
        assertTrue( ApiLevelLoader.loadAbstractionFor( 9 ) instanceof ApiLevel3 );
    }

    public void test_load_ApiLevel14() throws Exception
    {
        assertTrue( ApiLevelLoader.loadAbstractionFor( 14 ) instanceof ApiLevel14 );
    }

    public void test_load_ApiLevel15() throws Exception
    {
        assertTrue( ApiLevelLoader.loadAbstractionFor( 15 ) instanceof ApiLevel14 );
    }
}
