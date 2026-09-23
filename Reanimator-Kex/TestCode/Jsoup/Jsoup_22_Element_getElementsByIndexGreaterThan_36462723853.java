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
import java.lang.Integer;

public class Element_getElementsByIndexGreaterThan_36462723853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5190;
     Object term5253;

    public Element_getElementsByIndexGreaterThan_36462723853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5212 = new HashMap();
        Set<Object> term5265 =  ((Map) term5212).keySet();
        HashSet term5211 = new HashSet((Collection<? extends Object>) term5265);
        ArrayList term5224 = new ArrayList();
        ((ArrayList) term5224).add((Object)null);
        ((ArrayList) term5224).add((Object)null);
        ((ArrayList) term5224).add((Object)null);
        ((ArrayList) term5224).add((Object)null);
        ((ArrayList) term5224).add((Object)null);
        ((ArrayList) term5224).add((Object)null);
        LinkedHashMap term5229 = new LinkedHashMap();
        term5190 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5191 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5228 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5191, term5191.getClass(), "tagName", "sEphiduvkv");
        setBooleanField(term5191, term5191.getClass(), "isBlock", false);
        setBooleanField(term5191, term5191.getClass(), "formatAsBlock", false);
        setBooleanField(term5191, term5191.getClass(), "canContainBlock", true);
        setBooleanField(term5191, term5191.getClass(), "canContainInline", true);
        setBooleanField(term5191, term5191.getClass(), "empty", true);
        setBooleanField(term5191, term5191.getClass(), "selfClosing", false);
        setBooleanField(term5191, term5191.getClass(), "preserveWhitespace", true);
        setField(term5190, term5190.getClass(), "tag", term5191);
        setField(term5190, term5190.getClass(), "classNames", term5211);
        setField(term5190, term5190.getClass(), "parentNode", null);
        setField(term5190, term5190.getClass(), "childNodes", term5224);
        setField(term5228, term5228.getClass(), "attributes", term5229);
        setField(term5190, term5190.getClass(), "attributes", term5228);
        setField(term5190, term5190.getClass(), "baseUri", "bEmHScVZaQ");
        setIntField(term5190, term5190.getClass(), "siblingIndex", 1551099402);
        term5253 = new Integer(-2027534003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5253;
        callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term5190, args);
    }

};


