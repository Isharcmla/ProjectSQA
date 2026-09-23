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
import java.lang.OutOfMemoryError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_addAll_643491321303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2327013;
     Object term2327071;

    public Attributes_addAll_643491321303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2327013 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2326928 = (Object[]) newArray("java.lang.String", 242);
        setIntField(term2327013, term2327013.getClass(), "size", -1271758808);
        setField(term2327013, term2327013.getClass(), "keys", term2326928);
        term2327071 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setIntField(term2327071, term2327071.getClass(), "size", 1677721601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[1];
        args[0] = term2327071;
        try {
            callMethod(klass, "addAll", argTypes, term2327013, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};


