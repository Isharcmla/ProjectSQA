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

public class TarArchiveEntry_isFile_1241856310387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373514;
     Object term615386;

    public TarArchiveEntry_isFile_1241856310387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373514 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term373514, term373514.getClass(), "file", null);
        setByteField(term373514, term373514.getClass(), "linkFlag", (byte) 1);
        setField(term373514, term373514.getClass(), "name", "");
        term615386 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term615386, term615386.getClass(), "name", "");
        setBooleanField(term615386, term615386.getClass(), "preserveLeadingSlashes", false);
        setIntField(term615386, term615386.getClass(), "mode", 0);
        setLongField(term615386, term615386.getClass(), "userId", 0L);
        setLongField(term615386, term615386.getClass(), "groupId", 0L);
        setLongField(term615386, term615386.getClass(), "size", 0L);
        setLongField(term615386, term615386.getClass(), "modTime", 0L);
        setBooleanField(term615386, term615386.getClass(), "checkSumOK", false);
        setByteField(term615386, term615386.getClass(), "linkFlag", (byte) 1);
        setField(term615386, term615386.getClass(), "linkName", null);
        setField(term615386, term615386.getClass(), "magic", null);
        setField(term615386, term615386.getClass(), "version", null);
        setField(term615386, term615386.getClass(), "userName", null);
        setField(term615386, term615386.getClass(), "groupName", null);
        setIntField(term615386, term615386.getClass(), "devMajor", 0);
        setIntField(term615386, term615386.getClass(), "devMinor", 0);
        setBooleanField(term615386, term615386.getClass(), "isExtended", false);
        setLongField(term615386, term615386.getClass(), "realSize", 0L);
        setBooleanField(term615386, term615386.getClass(), "paxGNUSparse", false);
        setBooleanField(term615386, term615386.getClass(), "starSparse", false);
        setField(term615386, term615386.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFile", argTypes, term373514, args);
        assertTrue(recursiveEquals(term373514, term615386));
    }

};


