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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_toString_190359284388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17420;

    public Element_toString_190359284388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17442 = new HashMap();
        Set<Object> term17497 =  ((Map) term17442).keySet();
        HashSet term17441 = new HashSet((Collection<? extends Object>) term17497);
        ArrayList term17458 = new ArrayList();
        ((ArrayList) term17458).add((Object)null);
        LinkedHashMap term17463 = new LinkedHashMap();
        term17420 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17421 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17462 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17421, term17421.getClass(), "tagName", "qMKmSzOQXg");
        setBooleanField(term17421, term17421.getClass(), "isBlock", true);
        setBooleanField(term17421, term17421.getClass(), "formatAsBlock", true);
        setBooleanField(term17421, term17421.getClass(), "canContainBlock", true);
        setBooleanField(term17421, term17421.getClass(), "canContainInline", true);
        setBooleanField(term17421, term17421.getClass(), "empty", true);
        setBooleanField(term17421, term17421.getClass(), "selfClosing", true);
        setBooleanField(term17421, term17421.getClass(), "preserveWhitespace", false);
        setField(term17420, term17420.getClass(), "tag", term17421);
        setField(term17420, term17420.getClass(), "classNames", term17441);
        setField(term17420, term17420.getClass(), "parentNode", null);
        setField(term17420, term17420.getClass(), "childNodes", term17458);
        setField(term17462, term17462.getClass(), "attributes", term17463);
        setField(term17420, term17420.getClass(), "attributes", term17462);
        setField(term17420, term17420.getClass(), "baseUri", "hGTqHomrbc");
        setIntField(term17420, term17420.getClass(), "siblingIndex", -507387516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term17420, args);
    }

};


