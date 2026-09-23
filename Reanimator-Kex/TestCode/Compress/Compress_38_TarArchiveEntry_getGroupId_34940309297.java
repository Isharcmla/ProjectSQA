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

public class TarArchiveEntry_getGroupId_34940309297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3695;
     Object term25329;

    public TarArchiveEntry_getGroupId_34940309297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25370 = Class.forName((String) "java.io.File$PathStatus");
        Field term25369 = ((Class) term25370).getDeclaredField((String) "CHECKED");
        ((Field) term25369).setAccessible(true);
        Object enum101 = ((Field) term25369).get((Object) null);
        term3695 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3734 = newInstance(Class.forName("java.io.File"));
        setField(term3695, term3695.getClass(), "name", "");
        setBooleanField(term3695, term3695.getClass(), "preserveLeadingSlashes", false);
        setIntField(term3695, term3695.getClass(), "mode", 1225272962);
        setLongField(term3695, term3695.getClass(), "userId", -5963439350418910964L);
        setLongField(term3695, term3695.getClass(), "groupId", 9013624480170062917L);
        setLongField(term3695, term3695.getClass(), "size", 7862575738391801707L);
        setLongField(term3695, term3695.getClass(), "modTime", 50358265865610362L);
        setBooleanField(term3695, term3695.getClass(), "checkSumOK", false);
        setByteField(term3695, term3695.getClass(), "linkFlag", (byte) 23);
        setField(term3695, term3695.getClass(), "linkName", "");
        setField(term3695, term3695.getClass(), "magic", "ustar ");
        setField(term3695, term3695.getClass(), "version", "00");
        setField(term3695, term3695.getClass(), "userName", "root");
        setField(term3695, term3695.getClass(), "groupName", "");
        setIntField(term3695, term3695.getClass(), "devMajor", 1324040357);
        setIntField(term3695, term3695.getClass(), "devMinor", -1588772968);
        setBooleanField(term3695, term3695.getClass(), "isExtended", true);
        setLongField(term3695, term3695.getClass(), "realSize", 5510783420697225605L);
        setBooleanField(term3695, term3695.getClass(), "paxGNUSparse", false);
        setBooleanField(term3695, term3695.getClass(), "starSparse", false);
        setField(term3734, term3734.getClass(), "path", "BYqFIqCKAV");
        setField(term3734, term3734.getClass(), "status", enum101);
        setIntField(term3734, term3734.getClass(), "prefixLength", -93135961);
        setField(term3734, term3734.getClass(), "filePath", null);
        setField(term3695, term3695.getClass(), "file", term3734);
        Class<? extends Object> term25535 = Class.forName((String) "java.io.File$PathStatus");
        Field term25534 = ((Class) term25535).getDeclaredField((String) "CHECKED");
        ((Field) term25534).setAccessible(true);
        Object enum102 = ((Field) term25534).get((Object) null);
        term25329 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term25342 = newInstance(Class.forName("java.io.File"));
        setField(term25329, term25329.getClass(), "name", "");
        setBooleanField(term25329, term25329.getClass(), "preserveLeadingSlashes", false);
        setIntField(term25329, term25329.getClass(), "mode", 1225272962);
        setLongField(term25329, term25329.getClass(), "userId", -5963439350418910964L);
        setLongField(term25329, term25329.getClass(), "groupId", 9013624480170062917L);
        setLongField(term25329, term25329.getClass(), "size", 7862575738391801707L);
        setLongField(term25329, term25329.getClass(), "modTime", 50358265865610362L);
        setBooleanField(term25329, term25329.getClass(), "checkSumOK", false);
        setByteField(term25329, term25329.getClass(), "linkFlag", (byte) 23);
        setField(term25329, term25329.getClass(), "linkName", "");
        setField(term25329, term25329.getClass(), "magic", "ustar ");
        setField(term25329, term25329.getClass(), "version", "00");
        setField(term25329, term25329.getClass(), "userName", "root");
        setField(term25329, term25329.getClass(), "groupName", "");
        setIntField(term25329, term25329.getClass(), "devMajor", 1324040357);
        setIntField(term25329, term25329.getClass(), "devMinor", -1588772968);
        setBooleanField(term25329, term25329.getClass(), "isExtended", true);
        setLongField(term25329, term25329.getClass(), "realSize", 5510783420697225605L);
        setBooleanField(term25329, term25329.getClass(), "paxGNUSparse", false);
        setBooleanField(term25329, term25329.getClass(), "starSparse", false);
        setField(term25342, term25342.getClass(), "path", "BYqFIqCKAV");
        setField(term25342, term25342.getClass(), "status", enum102);
        setIntField(term25342, term25342.getClass(), "prefixLength", -93135961);
        setField(term25342, term25342.getClass(), "filePath", null);
        setField(term25329, term25329.getClass(), "file", term25342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGroupId", argTypes, term3695, args);
        assertTrue(recursiveEquals(term3695, term25329));
        assertTrue(recursiveEquals(retValue, 1598895173));
    }

};


