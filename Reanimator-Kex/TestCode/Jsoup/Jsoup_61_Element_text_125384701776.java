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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_text_125384701776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6227;

    public Element_text_125384701776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6249 = new ArrayList();
        ((ArrayList) term6249).add((Object)null);
        ((ArrayList) term6249).add((Object)null);
        LinkedHashMap term6254 = new LinkedHashMap();
        term6227 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6228 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6253 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6228, term6228.getClass(), "tagName", "oKwCDqywym");
        setBooleanField(term6228, term6228.getClass(), "isBlock", true);
        setBooleanField(term6228, term6228.getClass(), "formatAsBlock", true);
        setBooleanField(term6228, term6228.getClass(), "canContainInline", true);
        setBooleanField(term6228, term6228.getClass(), "empty", false);
        setBooleanField(term6228, term6228.getClass(), "selfClosing", false);
        setBooleanField(term6228, term6228.getClass(), "preserveWhitespace", false);
        setBooleanField(term6228, term6228.getClass(), "formList", true);
        setBooleanField(term6228, term6228.getClass(), "formSubmit", false);
        setField(term6227, term6227.getClass(), "tag", term6228);
        setField(term6227, term6227.getClass(), "parentNode", null);
        setField(term6227, term6227.getClass(), "childNodes", term6249);
        setField(term6253, term6253.getClass(), "attributes", term6254);
        setField(term6227, term6227.getClass(), "attributes", term6253);
        setField(term6227, term6227.getClass(), "baseUri", "HhEaSXWvrY");
        setIntField(term6227, term6227.getClass(), "siblingIndex", -1002370457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CVRGEomOth";
        callMethod(klass, "text", argTypes, term6227, args);
    }

};


