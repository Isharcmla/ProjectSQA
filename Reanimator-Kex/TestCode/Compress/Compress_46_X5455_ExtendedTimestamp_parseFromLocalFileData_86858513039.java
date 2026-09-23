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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class X5455_ExtendedTimestamp_parseFromLocalFileData_86858513039 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term67;
     Object term73;
     Object term75;

    public X5455_ExtendedTimestamp_parseFromLocalFileData_86858513039() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term61 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term63 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term65 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term56, term56.getClass(), "flags", (byte) -58);
        setBooleanField(term56, term56.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term56, term56.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term56, term56.getClass(), "bit2_createTimePresent", true);
        setLongField(term61, term61.getClass(), "value", -872011222785455006L);
        setField(term56, term56.getClass(), "modifyTime", term61);
        setLongField(term63, term63.getClass(), "value", -316468845751588286L);
        setField(term56, term56.getClass(), "accessTime", term63);
        setLongField(term65, term65.getClass(), "value", 5127676408959197577L);
        setField(term56, term56.getClass(), "createTime", term65);
        term67 = (byte[]) newByteArray(5);
        setByteElement(term67, 0, (byte) -29);
        setByteElement(term67, 1, (byte) -54);
        setByteElement(term67, 2, (byte) -10);
        setByteElement(term67, 3, (byte) 79);
        setByteElement(term67, 4, (byte) -119);
        term73 = new Integer(568599855);
        term75 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term67;
        args[1] = term73;
        args[2] = term75;
        try {
            callMethod(klass, "parseFromLocalFileData", argTypes, term56, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


