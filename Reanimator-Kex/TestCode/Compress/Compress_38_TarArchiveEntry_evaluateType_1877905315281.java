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

public class TarArchiveEntry_evaluateType_1877905315281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86936;
     Object term85789;
     Object term87981;
     Object term87982;

    public TarArchiveEntry_evaluateType_1877905315281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86936 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        term85789 = (byte[]) newByteArray(490);
        setByteElement(term85789, 0, (byte) 117);
        setByteElement(term85789, 1, (byte) 115);
        setByteElement(term85789, 2, (byte) 116);
        setByteElement(term85789, 3, (byte) 97);
        setByteElement(term85789, 4, (byte) 114);
        setByteElement(term85789, 5, (byte) 32);
        term87981 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        setField(term87981, term87981.getClass(), "name", null);
        setBooleanField(term87981, term87981.getClass(), "preserveLeadingSlashes", false);
        setIntField(term87981, term87981.getClass(), "mode", 0);
        setLongField(term87981, term87981.getClass(), "userId", 0L);
        setLongField(term87981, term87981.getClass(), "groupId", 0L);
        setLongField(term87981, term87981.getClass(), "size", 0L);
        setLongField(term87981, term87981.getClass(), "modTime", 0L);
        setBooleanField(term87981, term87981.getClass(), "checkSumOK", false);
        setByteField(term87981, term87981.getClass(), "linkFlag", (byte) 0);
        setField(term87981, term87981.getClass(), "linkName", null);
        setField(term87981, term87981.getClass(), "magic", null);
        setField(term87981, term87981.getClass(), "version", null);
        setField(term87981, term87981.getClass(), "userName", null);
        setField(term87981, term87981.getClass(), "groupName", null);
        setIntField(term87981, term87981.getClass(), "devMajor", 0);
        setIntField(term87981, term87981.getClass(), "devMinor", 0);
        setBooleanField(term87981, term87981.getClass(), "isExtended", false);
        setLongField(term87981, term87981.getClass(), "realSize", 0L);
        setBooleanField(term87981, term87981.getClass(), "paxGNUSparse", false);
        setBooleanField(term87981, term87981.getClass(), "starSparse", false);
        setField(term87981, term87981.getClass(), "file", null);
        term87982 = (byte[]) newByteArray(490);
        setByteElement(term87982, 0, (byte) 117);
        setByteElement(term87982, 1, (byte) 115);
        setByteElement(term87982, 2, (byte) 116);
        setByteElement(term87982, 3, (byte) 97);
        setByteElement(term87982, 4, (byte) 114);
        setByteElement(term87982, 5, (byte) 32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term85789;
        Object retValue = callMethod(klass, "evaluateType", argTypes, term86936, args);
        assertTrue(recursiveEquals(term86936, term87981));
        assertTrue(recursiveEquals(term85789, term87982));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


