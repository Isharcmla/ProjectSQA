package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Attributes_dataset_171066605353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601;
     Object term50059;
     Object term50054;

    public Attributes_dataset_171066605353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term603 = (Object[]) newArray("java.lang.String", 0);
        Object[] term604 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term601, term601.getClass(), "size", -1007160944);
        setField(term601, term601.getClass(), "keys", term603);
        setField(term601, term601.getClass(), "vals", term604);
        term50059 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term50060 = (Object[]) newArray("java.lang.String", 0);
        Object[] term50061 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term50059, term50059.getClass(), "size", -1007160944);
        setField(term50059, term50059.getClass(), "keys", term50060);
        setField(term50059, term50059.getClass(), "vals", term50061);
        term50054 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term50055 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term50057 = (Object[]) newArray("java.lang.String", 0);
        Object[] term50058 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term50055, term50055.getClass(), "size", -1007160944);
        setField(term50055, term50055.getClass(), "keys", term50057);
        setField(term50055, term50055.getClass(), "vals", term50058);
        setField(term50054, term50054.getClass(), "attributes", term50055);
        setField(term50054, term50054.getClass(), "keySet", null);
        setField(term50054, term50054.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term601, args);
        assertTrue(recursiveEquals(term601, term50059));
        assertTrue(recursiveEquals(retValue, term50054));
    }

};


