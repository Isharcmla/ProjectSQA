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
import java.lang.NullPointerException;
import static org.apache.commons.collections.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetUniqueList_clear_26032955995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21154;

    public SetUniqueList_clear_26032955995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21154 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term21258 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term21362 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term21466 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term21362, term21362.getClass(), "collection", term21466);
        setField(term21258, term21258.getClass(), "collection", term21362);
        setField(term21154, term21154.getClass(), "collection", term21258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term21154, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


