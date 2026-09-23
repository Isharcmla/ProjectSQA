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
import java.lang.Object;

public class W3CDom_fromJsoup_66549132660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109464;
     Object term109556;

    public W3CDom_fromJsoup_66549132660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109464 = newInstance(Class.forName("org.jsoup.helper.W3CDom"));
        setField(term109464, term109464.getClass(), "factory", "");
        term109556 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term109698 = newInstance(Class.forName("java.util.concurrent.ArrayBlockingQueue$Itrs$Node"));
        setField(term109556, term109556.getClass(), "location", "                                                                                                                                                                                                                                                                ");
        setField(term109556, term109556.getClass(), "shadowChildrenRef", term109698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.W3CDom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document");
        Object[] args = new Object[1];
        args[0] = term109556;
        callMethod(klass, "fromJsoup", argTypes, term109464, args);
    }

};


