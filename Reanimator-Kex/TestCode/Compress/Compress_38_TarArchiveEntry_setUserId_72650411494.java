package org.apache.commons.compress.archivers.tar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class TarArchiveEntry_setUserId_72650411494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3004;
     Object term3068;
     Object term24091;

    public TarArchiveEntry_setUserId_72650411494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24132 = Class.forName((String) "java.io.File$PathStatus");
        Field term24131 = ((Class) term24132).getDeclaredField((String) "INVALID");
        ((Field) term24131).setAccessible(true);
        Object enum95 = ((Field) term24131).get((Object) null);
        term3004 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3043 = newInstance(Class.forName("java.io.File"));
        setField(term3004, term3004.getClass(), "name", "");
        setBooleanField(term3004, term3004.getClass(), "preserveLeadingSlashes", true);
        setIntField(term3004, term3004.getClass(), "mode", 454281060);
        setLongField(term3004, term3004.getClass(), "userId", 5953383087795962419L);
        setLongField(term3004, term3004.getClass(), "groupId", 7994303628307559416L);
        setLongField(term3004, term3004.getClass(), "size", 2443640364875054177L);
        setLongField(term3004, term3004.getClass(), "modTime", -1610676979013636850L);
        setBooleanField(term3004, term3004.getClass(), "checkSumOK", true);
        setByteField(term3004, term3004.getClass(), "linkFlag", (byte) -16);
        setField(term3004, term3004.getClass(), "linkName", "");
        setField(term3004, term3004.getClass(), "magic", "ustar ");
        setField(term3004, term3004.getClass(), "version", "00");
        setField(term3004, term3004.getClass(), "userName", "root");
        setField(term3004, term3004.getClass(), "groupName", "");
        setIntField(term3004, term3004.getClass(), "devMajor", -1786399638);
        setIntField(term3004, term3004.getClass(), "devMinor", 2055867847);
        setBooleanField(term3004, term3004.getClass(), "isExtended", false);
        setLongField(term3004, term3004.getClass(), "realSize", 2062173786000223358L);
        setBooleanField(term3004, term3004.getClass(), "paxGNUSparse", false);
        setBooleanField(term3004, term3004.getClass(), "starSparse", true);
        setField(term3043, term3043.getClass(), "path", "RkybSrpybU");
        setField(term3043, term3043.getClass(), "status", enum95);
        setIntField(term3043, term3043.getClass(), "prefixLength", -1048298087);
        setField(term3043, term3043.getClass(), "filePath", null);
        setField(term3004, term3004.getClass(), "file", term3043);
        term3068 = new Integer(292681826);
        Class<? extends Object> term24297 = Class.forName((String) "java.io.File$PathStatus");
        Field term24296 = ((Class) term24297).getDeclaredField((String) "INVALID");
        ((Field) term24296).setAccessible(true);
        Object enum96 = ((Field) term24296).get((Object) null);
        term24091 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term24104 = newInstance(Class.forName("java.io.File"));
        setField(term24091, term24091.getClass(), "name", "");
        setBooleanField(term24091, term24091.getClass(), "preserveLeadingSlashes", true);
        setIntField(term24091, term24091.getClass(), "mode", 454281060);
        setLongField(term24091, term24091.getClass(), "userId", 292681826L);
        setLongField(term24091, term24091.getClass(), "groupId", 7994303628307559416L);
        setLongField(term24091, term24091.getClass(), "size", 2443640364875054177L);
        setLongField(term24091, term24091.getClass(), "modTime", -1610676979013636850L);
        setBooleanField(term24091, term24091.getClass(), "checkSumOK", true);
        setByteField(term24091, term24091.getClass(), "linkFlag", (byte) -16);
        setField(term24091, term24091.getClass(), "linkName", "");
        setField(term24091, term24091.getClass(), "magic", "ustar ");
        setField(term24091, term24091.getClass(), "version", "00");
        setField(term24091, term24091.getClass(), "userName", "root");
        setField(term24091, term24091.getClass(), "groupName", "");
        setIntField(term24091, term24091.getClass(), "devMajor", -1786399638);
        setIntField(term24091, term24091.getClass(), "devMinor", 2055867847);
        setBooleanField(term24091, term24091.getClass(), "isExtended", false);
        setLongField(term24091, term24091.getClass(), "realSize", 2062173786000223358L);
        setBooleanField(term24091, term24091.getClass(), "paxGNUSparse", false);
        setBooleanField(term24091, term24091.getClass(), "starSparse", true);
        setField(term24104, term24104.getClass(), "path", "RkybSrpybU");
        setField(term24104, term24104.getClass(), "status", enum96);
        setIntField(term24104, term24104.getClass(), "prefixLength", -1048298087);
        setField(term24104, term24104.getClass(), "filePath", null);
        setField(term24091, term24091.getClass(), "file", term24104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3068;
        callMethod(klass, "setUserId", argTypes, term3004, args);
        assertTrue(recursiveEquals(term3004, term24091));
        assertTrue(recursiveEquals(term3068, 292681826));
    }

};


