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

public class Element_hashCode_188061476390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17591;

    public Element_hashCode_188061476390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17613 = new HashMap();
        Set<Object> term17660 =  ((Map) term17613).keySet();
        HashSet term17612 = new HashSet((Collection<? extends Object>) term17660);
        ArrayList term17621 = new ArrayList();
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        ((ArrayList) term17621).add((Object)null);
        LinkedHashMap term17626 = new LinkedHashMap();
        term17591 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17592 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17625 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17592, term17592.getClass(), "tagName", "FBCXbjHVXO");
        setBooleanField(term17592, term17592.getClass(), "isBlock", false);
        setBooleanField(term17592, term17592.getClass(), "formatAsBlock", true);
        setBooleanField(term17592, term17592.getClass(), "canContainBlock", true);
        setBooleanField(term17592, term17592.getClass(), "canContainInline", false);
        setBooleanField(term17592, term17592.getClass(), "empty", false);
        setBooleanField(term17592, term17592.getClass(), "selfClosing", true);
        setBooleanField(term17592, term17592.getClass(), "preserveWhitespace", false);
        setField(term17591, term17591.getClass(), "tag", term17592);
        setField(term17591, term17591.getClass(), "classNames", term17612);
        setField(term17591, term17591.getClass(), "parentNode", null);
        setField(term17591, term17591.getClass(), "childNodes", term17621);
        setField(term17625, term17625.getClass(), "attributes", term17626);
        setField(term17591, term17591.getClass(), "attributes", term17625);
        setField(term17591, term17591.getClass(), "baseUri", "XmLHcnVsch");
        setIntField(term17591, term17591.getClass(), "siblingIndex", -1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term17591, args);
    }

};


