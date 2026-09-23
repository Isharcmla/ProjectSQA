package org.apache.commons.collections.list;

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
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_add_958215368142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40608;

    public SetUniqueList_add_958215368142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40608 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term40712 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term40816 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term40816, term40816.getClass(), "collection", term40816);
        setField(term40712, term40712.getClass(), "collection", term40816);
        setField(term40608, term40608.getClass(), "collection", term40712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term40608, args);
    }

};


