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

public class Element_firstElementSibling_1098119627128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;

    public Element_firstElementSibling_1098119627128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3266 = new HashMap();
        Set<Object> term20510 =  ((Map) term3266).keySet();
        HashSet term3265 = new HashSet((Collection<? extends Object>) term20510);
        ArrayList term3280 = new ArrayList();
        ((ArrayList) term3280).add((Object)null);
        LinkedHashMap term3285 = new LinkedHashMap();
        term3242 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3243 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3284 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3243, term3243.getClass(), "tagName", "dAldIGYAXV");
        setBooleanField(term3243, term3243.getClass(), "isBlock", false);
        setBooleanField(term3243, term3243.getClass(), "formatAsBlock", true);
        setBooleanField(term3243, term3243.getClass(), "canContainBlock", true);
        setBooleanField(term3243, term3243.getClass(), "canContainInline", false);
        setBooleanField(term3243, term3243.getClass(), "empty", true);
        setBooleanField(term3243, term3243.getClass(), "selfClosing", true);
        setBooleanField(term3243, term3243.getClass(), "preserveWhitespace", false);
        setBooleanField(term3243, term3243.getClass(), "formList", true);
        setBooleanField(term3243, term3243.getClass(), "formSubmit", true);
        setField(term3242, term3242.getClass(), "tag", term3243);
        setField(term3242, term3242.getClass(), "classNames", term3265);
        setField(term3242, term3242.getClass(), "parentNode", null);
        setField(term3242, term3242.getClass(), "childNodes", term3280);
        setField(term3284, term3284.getClass(), "attributes", term3285);
        setField(term3242, term3242.getClass(), "attributes", term3284);
        setField(term3242, term3242.getClass(), "baseUri", "GNEmuHPNcU");
        setIntField(term3242, term3242.getClass(), "siblingIndex", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "firstElementSibling", argTypes, term3242, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


