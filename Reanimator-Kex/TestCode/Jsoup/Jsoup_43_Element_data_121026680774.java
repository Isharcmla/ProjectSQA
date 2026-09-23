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

public class Element_data_121026680774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6201;

    public Element_data_121026680774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6224 = new ArrayList();
        ((ArrayList) term6224).add((Object)null);
        ((ArrayList) term6224).add((Object)null);
        LinkedHashMap term6229 = new LinkedHashMap();
        term6201 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6202 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6228 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6202, term6202.getClass(), "tagName", "ZwZIDwYcSW");
        setBooleanField(term6202, term6202.getClass(), "isBlock", false);
        setBooleanField(term6202, term6202.getClass(), "formatAsBlock", true);
        setBooleanField(term6202, term6202.getClass(), "canContainBlock", true);
        setBooleanField(term6202, term6202.getClass(), "canContainInline", false);
        setBooleanField(term6202, term6202.getClass(), "empty", true);
        setBooleanField(term6202, term6202.getClass(), "selfClosing", true);
        setBooleanField(term6202, term6202.getClass(), "preserveWhitespace", false);
        setBooleanField(term6202, term6202.getClass(), "formList", false);
        setBooleanField(term6202, term6202.getClass(), "formSubmit", true);
        setField(term6201, term6201.getClass(), "tag", term6202);
        setField(term6201, term6201.getClass(), "parentNode", null);
        setField(term6201, term6201.getClass(), "childNodes", term6224);
        setField(term6228, term6228.getClass(), "attributes", term6229);
        setField(term6201, term6201.getClass(), "attributes", term6228);
        setField(term6201, term6201.getClass(), "baseUri", "QtrylgCLiF");
        setIntField(term6201, term6201.getClass(), "siblingIndex", 2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term6201, args);
    }

};


