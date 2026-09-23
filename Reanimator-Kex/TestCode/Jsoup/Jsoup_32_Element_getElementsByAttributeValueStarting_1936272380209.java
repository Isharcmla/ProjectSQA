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

public class Element_getElementsByAttributeValueStarting_1936272380209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56819;

    public Element_getElementsByAttributeValueStarting_1936272380209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term56937 = new LinkedHashMap();
        ArrayList term57093 = new ArrayList();
        ((ArrayList) term57093).add("");
        term56819 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56877 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56877, term56877.getClass(), "attributes", term56937);
        setField(term56819, term56819.getClass(), "attributes", term56877);
        setField(term56819, term56819.getClass(), "childNodes", term57093);
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
        callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term56819, args);
    }

};


