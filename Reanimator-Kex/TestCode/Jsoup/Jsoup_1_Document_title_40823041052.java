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

public class Document_title_40823041052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30890;

    public Document_title_40823041052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31080 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        ArrayList term31026 = new ArrayList();
        ((ArrayList) term31026).add((Object)null);
        ((ArrayList) term31026).add(term31080);
        term30890 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term30936 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term30936, term30936.getClass(), "tagName", "                                                                                                                                                                                                                                         ");
        setField(term30890, term30890.getClass(), "tag", term30936);
        setField(term30890, term30890.getClass(), "childNodes", term31026);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "title", argTypes, term30890, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
