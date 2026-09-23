package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38509;
     Object term38522;
     Object term38514;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38509 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term38509, term38509.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term38509, term38509.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term38509, term38509.getClass(), "bit2_createTimePresent", true);
        term38522 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term38522, term38522.getClass(), "flags", (byte) 0);
        setBooleanField(term38522, term38522.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term38522, term38522.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term38522, term38522.getClass(), "bit2_createTimePresent", true);
        setField(term38522, term38522.getClass(), "modifyTime", null);
        setField(term38522, term38522.getClass(), "accessTime", null);
        setField(term38522, term38522.getClass(), "createTime", null);
        term38514 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term38514, term38514.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term38509, args);
        assertTrue(recursiveEquals(term38509, term38522));
        assertTrue(recursiveEquals(retValue, term38514));
    }

};


