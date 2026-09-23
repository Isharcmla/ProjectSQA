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
import java.lang.Object;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class Element_getElementsByAttributeValueContaining_46475118268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70175;

    public Element_getElementsByAttributeValueContaining_46475118268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term70293 = new LinkedHashMap();
        ArrayList term70449 = new ArrayList();
        ((ArrayList) term70449).add("");
        term70175 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term70233 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term70233, term70233.getClass(), "attributes", term70293);
        setField(term70175, term70175.getClass(), "attributes", term70233);
        setField(term70175, term70175.getClass(), "childNodes", term70449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "                                                  ";
        args[1] = "                                            ";
        callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term70175, args);
    }

};


