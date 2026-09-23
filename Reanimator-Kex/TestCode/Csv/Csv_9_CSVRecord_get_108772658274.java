package org.apache.commons.csv;

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
import java.lang.IllegalArgumentException;
import static org.apache.commons.csv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class CSVRecord_get_108772658274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17529;
     Object enum14;

    public CSVRecord_get_108772658274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object[] term17399 = (Object[]) newArray("java.lang.Object", 0);
        HashMap term17577 = new HashMap();
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)null, (Object)null);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)null, (Object)null);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        ((HashMap) term17577).put((Object)term17399, (Object)term17399);
        term17529 = newInstance(Class.forName("org.apache.commons.csv.CSVRecord"));
        setField(term17529, term17529.getClass(), "mapping", term17577);
        Class<? extends Object> term18400 = Class.forName((String) "java.nio.file.attribute.AclEntryFlag");
        Field term18399 = ((Class) term18400).getDeclaredField((String) "FILE_INHERIT");
        ((Field) term18399).setAccessible(true);
        enum14 = ((Field) term18399).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.csv.CSVRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Enum");
        Object[] args = new Object[1];
        args[0] = enum14;
        try {
            callMethod(klass, "get", argTypes, term17529, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


