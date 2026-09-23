package org.jfree.data.general;

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
import static org.jfree.data.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DatasetUtilities_createCategoryDataset_92068804158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public DatasetUtilities_createCategoryDataset_92068804158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30774 = Class.forName((String) "java.nio.file.attribute.AclEntryType");
        Field term30773 = ((Class) term30774).getDeclaredField((String) "ALLOW");
        ((Field) term30773).setAccessible(true);
        enum0 = ((Field) term30773).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.general.DatasetUtilities");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Comparable");
        argTypes[1] = Class.forName("org.jfree.data.KeyedValues");
        Object[] args = new Object[2];
        args[0] = enum0;
        args[1] = null;
        callMethod(klass, "createCategoryDataset", argTypes, null, args);
    }

};


