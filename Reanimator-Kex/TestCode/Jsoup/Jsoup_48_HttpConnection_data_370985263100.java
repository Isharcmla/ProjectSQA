package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;

public class HttpConnection_data_370985263100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43651;
     Object term43566;
     Object term43745;
     Object term43746;

    public HttpConnection_data_370985263100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43651 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        term43566 = (Object[]) newArray("java.lang.String", 0);
        term43745 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        setField(term43745, term43745.getClass(), "req", null);
        setField(term43745, term43745.getClass(), "res", null);
        term43746 = (Object[]) newArray("java.lang.String", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term43566;
        callMethod(klass, "data", argTypes, term43651, args);
        assertTrue(recursiveEquals(term43651, term43745));
        assertTrue(recursiveEquals(term43566, term43746));
    }

};


