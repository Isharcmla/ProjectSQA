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

public class SetUniqueList_iterator_39035116495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20986;

    public SetUniqueList_iterator_39035116495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20986 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term21090 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        Object term21194 = newInstance(Class.forName("org.apache.commons.collections.list.SetUniqueList"));
        setField(term21090, term21090.getClass(), "collection", term21194);
        setField(term20986, term20986.getClass(), "collection", term21090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.list.SetUniqueList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "iterator", argTypes, term20986, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


