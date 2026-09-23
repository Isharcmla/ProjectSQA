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

public class TarArchiveEntry_isGNUSparse_698311188201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63699;
     Object term63721;

    public TarArchiveEntry_isGNUSparse_698311188201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63699 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setByteField(term63699, term63699.getClass(), "linkFlag", (byte) 0);
        setBooleanField(term63699, term63699.getClass(), "paxGNUSparse", false);
        term63721 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term63721, term63721.getClass(), "name", null);
        setBooleanField(term63721, term63721.getClass(), "preserveLeadingSlashes", false);
        setIntField(term63721, term63721.getClass(), "mode", 0);
        setLongField(term63721, term63721.getClass(), "userId", 0L);
        setLongField(term63721, term63721.getClass(), "groupId", 0L);
        setLongField(term63721, term63721.getClass(), "size", 0L);
        setLongField(term63721, term63721.getClass(), "modTime", 0L);
        setBooleanField(term63721, term63721.getClass(), "checkSumOK", false);
        setByteField(term63721, term63721.getClass(), "linkFlag", (byte) 0);
        setField(term63721, term63721.getClass(), "linkName", null);
        setField(term63721, term63721.getClass(), "magic", null);
        setField(term63721, term63721.getClass(), "version", null);
        setField(term63721, term63721.getClass(), "userName", null);
        setField(term63721, term63721.getClass(), "groupName", null);
        setIntField(term63721, term63721.getClass(), "devMajor", 0);
        setIntField(term63721, term63721.getClass(), "devMinor", 0);
        setBooleanField(term63721, term63721.getClass(), "isExtended", false);
        setLongField(term63721, term63721.getClass(), "realSize", 0L);
        setBooleanField(term63721, term63721.getClass(), "paxGNUSparse", false);
        setBooleanField(term63721, term63721.getClass(), "starSparse", false);
        setField(term63721, term63721.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isGNUSparse", argTypes, term63699, args);
        assertTrue(recursiveEquals(term63699, term63721));
        assertTrue(recursiveEquals(retValue, false));
    }

};


