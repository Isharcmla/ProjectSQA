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

public class Attributes_dataset_1710666053141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3025702;
     Object term3025718;
     Object term3025717;

    public Attributes_dataset_1710666053141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3025702 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3025702, term3025702.getClass(), "attributes", null);
        LinkedHashMap term3025719 = new LinkedHashMap();
        term3025718 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3025718, term3025718.getClass(), "attributes", term3025719);
        LinkedHashMap term3025704 = new LinkedHashMap();
        term3025717 = newInstance(Class.forName("org.jsoup.nodes.Attributes$Dataset"));
        Object term3025703 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3025703, term3025703.getClass(), "attributes", term3025704);
        setField(term3025717, term3025717.getClass(), "this$0", term3025703);
        setField(term3025717, term3025717.getClass(), "keySet", null);
        setField(term3025717, term3025717.getClass(), "values", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataset", argTypes, term3025702, args);
        assertTrue(recursiveEquals(term3025702, term3025718));
        assertTrue(recursiveEquals(retValue, term3025717));
    }

};


