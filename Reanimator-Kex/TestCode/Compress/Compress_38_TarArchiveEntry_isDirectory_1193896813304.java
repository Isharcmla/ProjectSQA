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

public class TarArchiveEntry_isDirectory_1193896813304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96943;
     Object term337417;

    public TarArchiveEntry_isDirectory_1193896813304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96943 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term96943, term96943.getClass(), "file", null);
        setByteField(term96943, term96943.getClass(), "linkFlag", (byte) 0);
        setField(term96943, term96943.getClass(), "name", "");
        term337417 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term337417, term337417.getClass(), "name", "");
        setBooleanField(term337417, term337417.getClass(), "preserveLeadingSlashes", false);
        setIntField(term337417, term337417.getClass(), "mode", 0);
        setLongField(term337417, term337417.getClass(), "userId", 0L);
        setLongField(term337417, term337417.getClass(), "groupId", 0L);
        setLongField(term337417, term337417.getClass(), "size", 0L);
        setLongField(term337417, term337417.getClass(), "modTime", 0L);
        setBooleanField(term337417, term337417.getClass(), "checkSumOK", false);
        setByteField(term337417, term337417.getClass(), "linkFlag", (byte) 0);
        setField(term337417, term337417.getClass(), "linkName", null);
        setField(term337417, term337417.getClass(), "magic", null);
        setField(term337417, term337417.getClass(), "version", null);
        setField(term337417, term337417.getClass(), "userName", null);
        setField(term337417, term337417.getClass(), "groupName", null);
        setIntField(term337417, term337417.getClass(), "devMajor", 0);
        setIntField(term337417, term337417.getClass(), "devMinor", 0);
        setBooleanField(term337417, term337417.getClass(), "isExtended", false);
        setLongField(term337417, term337417.getClass(), "realSize", 0L);
        setBooleanField(term337417, term337417.getClass(), "paxGNUSparse", false);
        setBooleanField(term337417, term337417.getClass(), "starSparse", false);
        setField(term337417, term337417.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term96943, args);
        assertTrue(recursiveEquals(term96943, term337417));
    }

};


