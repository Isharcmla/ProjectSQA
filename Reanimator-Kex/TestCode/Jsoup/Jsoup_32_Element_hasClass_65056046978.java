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

public class Element_hasClass_65056046978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7614;

    public Element_hasClass_65056046978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7636 = new HashMap();
        Set<Object> term7703 =  ((Map) term7636).keySet();
        HashSet term7635 = new HashSet((Collection<? extends Object>) term7703);
        ArrayList term7652 = new ArrayList();
        ((ArrayList) term7652).add((Object)null);
        ((ArrayList) term7652).add((Object)null);
        ((ArrayList) term7652).add((Object)null);
        LinkedHashMap term7657 = new LinkedHashMap();
        term7614 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7615 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7656 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7615, term7615.getClass(), "tagName", "itAUCFhZhq");
        setBooleanField(term7615, term7615.getClass(), "isBlock", false);
        setBooleanField(term7615, term7615.getClass(), "formatAsBlock", true);
        setBooleanField(term7615, term7615.getClass(), "canContainBlock", true);
        setBooleanField(term7615, term7615.getClass(), "canContainInline", false);
        setBooleanField(term7615, term7615.getClass(), "empty", false);
        setBooleanField(term7615, term7615.getClass(), "selfClosing", true);
        setBooleanField(term7615, term7615.getClass(), "preserveWhitespace", true);
        setField(term7614, term7614.getClass(), "tag", term7615);
        setField(term7614, term7614.getClass(), "classNames", term7635);
        setField(term7614, term7614.getClass(), "parentNode", null);
        setField(term7614, term7614.getClass(), "childNodes", term7652);
        setField(term7656, term7656.getClass(), "attributes", term7657);
        setField(term7614, term7614.getClass(), "attributes", term7656);
        setField(term7614, term7614.getClass(), "baseUri", "CRAUqtVBkU");
        setIntField(term7614, term7614.getClass(), "siblingIndex", 628918458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DddqUYfomL";
        callMethod(klass, "hasClass", argTypes, term7614, args);
    }

};


