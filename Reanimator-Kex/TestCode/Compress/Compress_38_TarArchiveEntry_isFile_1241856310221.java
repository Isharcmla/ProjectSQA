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

public class TarArchiveEntry_isFile_1241856310221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68546;
     Object term68565;

    public TarArchiveEntry_isFile_1241856310221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68546 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term68546, term68546.getClass(), "file", null);
        term68565 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term68565, term68565.getClass(), "name", null);
        setBooleanField(term68565, term68565.getClass(), "preserveLeadingSlashes", false);
        setIntField(term68565, term68565.getClass(), "mode", 0);
        setLongField(term68565, term68565.getClass(), "userId", 0L);
        setLongField(term68565, term68565.getClass(), "groupId", 0L);
        setLongField(term68565, term68565.getClass(), "size", 0L);
        setLongField(term68565, term68565.getClass(), "modTime", 0L);
        setBooleanField(term68565, term68565.getClass(), "checkSumOK", false);
        setByteField(term68565, term68565.getClass(), "linkFlag", (byte) 0);
        setField(term68565, term68565.getClass(), "linkName", null);
        setField(term68565, term68565.getClass(), "magic", null);
        setField(term68565, term68565.getClass(), "version", null);
        setField(term68565, term68565.getClass(), "userName", null);
        setField(term68565, term68565.getClass(), "groupName", null);
        setIntField(term68565, term68565.getClass(), "devMajor", 0);
        setIntField(term68565, term68565.getClass(), "devMinor", 0);
        setBooleanField(term68565, term68565.getClass(), "isExtended", false);
        setLongField(term68565, term68565.getClass(), "realSize", 0L);
        setBooleanField(term68565, term68565.getClass(), "paxGNUSparse", false);
        setBooleanField(term68565, term68565.getClass(), "starSparse", false);
        setField(term68565, term68565.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFile", argTypes, term68546, args);
        assertTrue(recursiveEquals(term68546, term68565));
    }

};


