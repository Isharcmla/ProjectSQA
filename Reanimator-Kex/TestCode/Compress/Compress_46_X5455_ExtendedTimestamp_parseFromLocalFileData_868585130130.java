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
import java.lang.Object;

public class X5455_ExtendedTimestamp_parseFromLocalFileData_868585130130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14849;
     Object term14671;

    public X5455_ExtendedTimestamp_parseFromLocalFileData_868585130130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14849 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term14953 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term15057 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term14849, term14849.getClass(), "flags", (byte) 0);
        setBooleanField(term14849, term14849.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term14849, term14849.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term14849, term14849.getClass(), "bit2_createTimePresent", false);
        setField(term14849, term14849.getClass(), "modifyTime", term14953);
        setField(term14849, term14849.getClass(), "accessTime", term15057);
        setField(term14849, term14849.getClass(), "createTime", null);
        term14671 = (byte[]) newByteArray(0);
        setByteElement(term14671, -1, (byte) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term14671;
        args[1] = -1;
        args[2] = 0;
        callMethod(klass, "parseFromLocalFileData", argTypes, term14849, args);
    }

};


