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

public class Element_className_78448294274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7198;

    public Element_className_78448294274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7222 = new HashMap();
        Set<Object> term7269 =  ((Map) term7222).keySet();
        HashSet term7221 = new HashSet((Collection<? extends Object>) term7269);
        ArrayList term7230 = new ArrayList();
        ((ArrayList) term7230).add((Object)null);
        LinkedHashMap term7235 = new LinkedHashMap();
        term7198 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7199 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7234 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7199, term7199.getClass(), "tagName", "asMqnMNrZp");
        setBooleanField(term7199, term7199.getClass(), "isBlock", true);
        setBooleanField(term7199, term7199.getClass(), "formatAsBlock", false);
        setBooleanField(term7199, term7199.getClass(), "canContainBlock", true);
        setBooleanField(term7199, term7199.getClass(), "canContainInline", false);
        setBooleanField(term7199, term7199.getClass(), "empty", false);
        setBooleanField(term7199, term7199.getClass(), "selfClosing", false);
        setBooleanField(term7199, term7199.getClass(), "preserveWhitespace", true);
        setBooleanField(term7199, term7199.getClass(), "formList", false);
        setBooleanField(term7199, term7199.getClass(), "formSubmit", false);
        setField(term7198, term7198.getClass(), "tag", term7199);
        setField(term7198, term7198.getClass(), "classNames", term7221);
        setField(term7198, term7198.getClass(), "parentNode", null);
        setField(term7198, term7198.getClass(), "childNodes", term7230);
        setField(term7234, term7234.getClass(), "attributes", term7235);
        setField(term7198, term7198.getClass(), "attributes", term7234);
        setField(term7198, term7198.getClass(), "baseUri", "QVLresHoaP");
        setIntField(term7198, term7198.getClass(), "siblingIndex", 229204365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "className", argTypes, term7198, args);
    }

};


