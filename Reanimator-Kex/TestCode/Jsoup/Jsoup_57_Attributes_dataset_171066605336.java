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
import java.util.LinkedHashMap;
import java.lang.Object;

public class Attributes_dataset_171066605336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;
     Object term1681;
     Object term1680;

    public Attributes_dataset_171066605336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term597 = new LinkedHashMap();
        term596 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term596, term596.getClass(), "attributes", term597);
        LinkedHashMap term1682 = new LinkedHashMap();
        term1681 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1681, term1681.getClass(), "attributes", term1682);
        LinkedHashMap term1673 = new LinkedHashMap();
        term1680 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term1672 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1672, term1672.getClass(), "attributes", term1673);
        setField(term1680, term1680.getClass(), "this$0", term1672);
        setField(term1680, term1680.getClass(), "keySet", null);
        setField(term1680, term1680.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term596, args);
        assertTrue(recursiveEquals(term596, term1681));
        assertTrue(recursiveEquals(retValue, term1680));
    }

};


