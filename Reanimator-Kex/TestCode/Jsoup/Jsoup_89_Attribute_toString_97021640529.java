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

public class Attribute_toString_97021640529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47827;
     Object term103749;

    public Attribute_toString_97021640529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47827 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term47852 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term47854 = (Object[]) newArray("java.lang.String", 0);
        Object[] term47855 = (Object[]) newArray("java.lang.String", 0);
        setField(term47827, term47827.getClass(), "key", "hNxWaHcfhY");
        setField(term47827, term47827.getClass(), "val", "RkybSrpybU");
        setIntField(term47852, term47852.getClass(), "size", -2038273078);
        setField(term47852, term47852.getClass(), "keys", term47854);
        setField(term47852, term47852.getClass(), "vals", term47855);
        setField(term47827, term47827.getClass(), "parent", term47852);
        term103749 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term103754 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term103755 = (Object[]) newArray("java.lang.String", 0);
        Object[] term103756 = (Object[]) newArray("java.lang.String", 0);
        setField(term103749, term103749.getClass(), "key", "hNxWaHcfhY");
        setField(term103749, term103749.getClass(), "val", "RkybSrpybU");
        setIntField(term103754, term103754.getClass(), "size", -2038273078);
        setField(term103754, term103754.getClass(), "keys", term103755);
        setField(term103754, term103754.getClass(), "vals", term103756);
        setField(term103749, term103749.getClass(), "parent", term103754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term47827, args);
        assertTrue(recursiveEquals(term47827, term103749));
        assertTrue(recursiveEquals(retValue, "hNxWaHcfhY=\"RkybSrpybU\""));
    }

};


