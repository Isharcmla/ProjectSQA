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

public class SetUniqueList_clear_260329559133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31526;

    public SetUniqueList_clear_260329559133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31526 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31630 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31734 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term31838 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term31734, term31734.getClass(), "collection", term31838);
        setField(term31630, term31630.getClass(), "collection", term31734);
        setField(term31526, term31526.getClass(), "collection", term31630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clear", argTypes, term31526, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


