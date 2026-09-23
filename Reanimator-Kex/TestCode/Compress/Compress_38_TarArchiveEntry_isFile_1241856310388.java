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

public class TarArchiveEntry_isFile_1241856310388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373688;
     Object term615408;

    public TarArchiveEntry_isFile_1241856310388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373688 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term373688, term373688.getClass(), "file", null);
        setByteField(term373688, term373688.getClass(), "linkFlag", (byte) 48);
        term615408 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term615408, term615408.getClass(), "name", null);
        setBooleanField(term615408, term615408.getClass(), "preserveLeadingSlashes", false);
        setIntField(term615408, term615408.getClass(), "mode", 0);
        setLongField(term615408, term615408.getClass(), "userId", 0L);
        setLongField(term615408, term615408.getClass(), "groupId", 0L);
        setLongField(term615408, term615408.getClass(), "size", 0L);
        setLongField(term615408, term615408.getClass(), "modTime", 0L);
        setBooleanField(term615408, term615408.getClass(), "checkSumOK", false);
        setByteField(term615408, term615408.getClass(), "linkFlag", (byte) 48);
        setField(term615408, term615408.getClass(), "linkName", null);
        setField(term615408, term615408.getClass(), "magic", null);
        setField(term615408, term615408.getClass(), "version", null);
        setField(term615408, term615408.getClass(), "userName", null);
        setField(term615408, term615408.getClass(), "groupName", null);
        setIntField(term615408, term615408.getClass(), "devMajor", 0);
        setIntField(term615408, term615408.getClass(), "devMinor", 0);
        setBooleanField(term615408, term615408.getClass(), "isExtended", false);
        setLongField(term615408, term615408.getClass(), "realSize", 0L);
        setBooleanField(term615408, term615408.getClass(), "paxGNUSparse", false);
        setBooleanField(term615408, term615408.getClass(), "starSparse", false);
        setField(term615408, term615408.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFile", argTypes, term373688, args);
        assertTrue(recursiveEquals(term373688, term615408));
    }

};


