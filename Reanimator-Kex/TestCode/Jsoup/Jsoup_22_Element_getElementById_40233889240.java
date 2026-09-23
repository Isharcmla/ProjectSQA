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

public class Element_getElementById_40233889240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3674;

    public Element_getElementById_40233889240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3696 = new HashMap();
        Set<Object> term3755 =  ((Map) term3696).keySet();
        HashSet term3695 = new HashSet((Collection<? extends Object>) term3755);
        ArrayList term3704 = new ArrayList();
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        ((ArrayList) term3704).add((Object)null);
        LinkedHashMap term3709 = new LinkedHashMap();
        term3674 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3675 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3708 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3675, term3675.getClass(), "tagName", "ZwZIDwYcSW");
        setBooleanField(term3675, term3675.getClass(), "isBlock", true);
        setBooleanField(term3675, term3675.getClass(), "formatAsBlock", true);
        setBooleanField(term3675, term3675.getClass(), "canContainBlock", true);
        setBooleanField(term3675, term3675.getClass(), "canContainInline", true);
        setBooleanField(term3675, term3675.getClass(), "empty", false);
        setBooleanField(term3675, term3675.getClass(), "selfClosing", false);
        setBooleanField(term3675, term3675.getClass(), "preserveWhitespace", false);
        setField(term3674, term3674.getClass(), "tag", term3675);
        setField(term3674, term3674.getClass(), "classNames", term3695);
        setField(term3674, term3674.getClass(), "parentNode", null);
        setField(term3674, term3674.getClass(), "childNodes", term3704);
        setField(term3708, term3708.getClass(), "attributes", term3709);
        setField(term3674, term3674.getClass(), "attributes", term3708);
        setField(term3674, term3674.getClass(), "baseUri", "orEuhCStGM");
        setIntField(term3674, term3674.getClass(), "siblingIndex", 1962444399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HhEaSXWvrY";
        callMethod(klass, "getElementById", argTypes, term3674, args);
    }

};


