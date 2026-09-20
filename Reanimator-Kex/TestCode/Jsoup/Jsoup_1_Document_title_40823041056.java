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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_40823041056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38309;

    public Document_title_40823041056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38445 = new ArrayList();
        ((ArrayList) term38445).add((Object)null);
        term38309 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term38355 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38355, term38355.getClass(), "tagName", " ");
        setField(term38309, term38309.getClass(), "tag", term38355);
        setField(term38309, term38309.getClass(), "childNodes", term38445);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "title", argTypes, term38309, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
