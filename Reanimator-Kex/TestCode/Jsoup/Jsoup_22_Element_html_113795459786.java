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

public class Element_html_113795459786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17195;
     Object term17264;

    public Element_html_113795459786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17217 = new HashMap();
        Set<Object> term17294 =  ((Map) term17217).keySet();
        HashSet term17216 = new HashSet((Collection<? extends Object>) term17294);
        ArrayList term17235 = new ArrayList();
        ((ArrayList) term17235).add((Object)null);
        ((ArrayList) term17235).add((Object)null);
        LinkedHashMap term17240 = new LinkedHashMap();
        term17195 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17196 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17239 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17196, term17196.getClass(), "tagName", "bbHWyibNmy");
        setBooleanField(term17196, term17196.getClass(), "isBlock", false);
        setBooleanField(term17196, term17196.getClass(), "formatAsBlock", true);
        setBooleanField(term17196, term17196.getClass(), "canContainBlock", true);
        setBooleanField(term17196, term17196.getClass(), "canContainInline", false);
        setBooleanField(term17196, term17196.getClass(), "empty", false);
        setBooleanField(term17196, term17196.getClass(), "selfClosing", false);
        setBooleanField(term17196, term17196.getClass(), "preserveWhitespace", false);
        setField(term17195, term17195.getClass(), "tag", term17196);
        setField(term17195, term17195.getClass(), "classNames", term17216);
        setField(term17195, term17195.getClass(), "parentNode", null);
        setField(term17195, term17195.getClass(), "childNodes", term17235);
        setField(term17239, term17239.getClass(), "attributes", term17240);
        setField(term17195, term17195.getClass(), "attributes", term17239);
        setField(term17195, term17195.getClass(), "baseUri", "vfennwtmqe");
        setIntField(term17195, term17195.getClass(), "siblingIndex", 1358829571);
        term17264 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term17265 = (byte[]) newByteArray(16);
        setField(term17264, term17264.getClass(), "value", term17265);
        setByteField(term17264, term17264.getClass(), "coder", (byte) -29);
        setIntField(term17264, term17264.getClass(), "count", 991356662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term17264;
        callMethod(klass, "html", argTypes, term17195, args);
    }

};


