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

public class TarArchiveEntry_isDirectory_1193896813386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373209;
     Object term615103;

    public TarArchiveEntry_isDirectory_1193896813386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373209 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term373209, term373209.getClass(), "file", null);
        setByteField(term373209, term373209.getClass(), "linkFlag", (byte) -128);
        setField(term373209, term373209.getClass(), "name", "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        term615103 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term615103, term615103.getClass(), "name", "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        setBooleanField(term615103, term615103.getClass(), "preserveLeadingSlashes", false);
        setIntField(term615103, term615103.getClass(), "mode", 0);
        setLongField(term615103, term615103.getClass(), "userId", 0L);
        setLongField(term615103, term615103.getClass(), "groupId", 0L);
        setLongField(term615103, term615103.getClass(), "size", 0L);
        setLongField(term615103, term615103.getClass(), "modTime", 0L);
        setBooleanField(term615103, term615103.getClass(), "checkSumOK", false);
        setByteField(term615103, term615103.getClass(), "linkFlag", (byte) -128);
        setField(term615103, term615103.getClass(), "linkName", null);
        setField(term615103, term615103.getClass(), "magic", null);
        setField(term615103, term615103.getClass(), "version", null);
        setField(term615103, term615103.getClass(), "userName", null);
        setField(term615103, term615103.getClass(), "groupName", null);
        setIntField(term615103, term615103.getClass(), "devMajor", 0);
        setIntField(term615103, term615103.getClass(), "devMinor", 0);
        setBooleanField(term615103, term615103.getClass(), "isExtended", false);
        setLongField(term615103, term615103.getClass(), "realSize", 0L);
        setBooleanField(term615103, term615103.getClass(), "paxGNUSparse", false);
        setBooleanField(term615103, term615103.getClass(), "starSparse", false);
        setField(term615103, term615103.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirectory", argTypes, term373209, args);
        assertTrue(recursiveEquals(term373209, term615103));
    }

};


