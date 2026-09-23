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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_lastElementSibling_936429029130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3409;

    public Element_lastElementSibling_936429029130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3433 = new HashMap();
        Set<Object> term20975 =  ((Map) term3433).keySet();
        HashSet term3432 = new HashSet((Collection<? extends Object>) term20975);
        ArrayList term3445 = new ArrayList();
        ((ArrayList) term3445).add((Object)null);
        LinkedHashMap term3450 = new LinkedHashMap();
        term3409 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3410 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3449 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3410, term3410.getClass(), "tagName", "BDIRCxAWLA");
        setBooleanField(term3410, term3410.getClass(), "isBlock", false);
        setBooleanField(term3410, term3410.getClass(), "formatAsBlock", true);
        setBooleanField(term3410, term3410.getClass(), "canContainBlock", true);
        setBooleanField(term3410, term3410.getClass(), "canContainInline", false);
        setBooleanField(term3410, term3410.getClass(), "empty", true);
        setBooleanField(term3410, term3410.getClass(), "selfClosing", true);
        setBooleanField(term3410, term3410.getClass(), "preserveWhitespace", true);
        setBooleanField(term3410, term3410.getClass(), "formList", false);
        setBooleanField(term3410, term3410.getClass(), "formSubmit", true);
        setField(term3409, term3409.getClass(), "tag", term3410);
        setField(term3409, term3409.getClass(), "classNames", term3432);
        setField(term3409, term3409.getClass(), "parentNode", null);
        setField(term3409, term3409.getClass(), "childNodes", term3445);
        setField(term3449, term3449.getClass(), "attributes", term3450);
        setField(term3409, term3409.getClass(), "attributes", term3449);
        setField(term3409, term3409.getClass(), "baseUri", "HpZXWDPhlg");
        setIntField(term3409, term3409.getClass(), "siblingIndex", -1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastElementSibling", argTypes, term3409, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


