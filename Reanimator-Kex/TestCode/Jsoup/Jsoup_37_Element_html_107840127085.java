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

public class Element_html_107840127085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8360;

    public Element_html_107840127085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8384 = new HashMap();
        Set<Object> term8433 =  ((Map) term8384).keySet();
        HashSet term8383 = new HashSet((Collection<? extends Object>) term8433);
        ArrayList term8394 = new ArrayList();
        ((ArrayList) term8394).add((Object)null);
        ((ArrayList) term8394).add((Object)null);
        ((ArrayList) term8394).add((Object)null);
        ((ArrayList) term8394).add((Object)null);
        LinkedHashMap term8399 = new LinkedHashMap();
        term8360 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8361 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8398 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8361, term8361.getClass(), "tagName", "dikKjYjmRO");
        setBooleanField(term8361, term8361.getClass(), "isBlock", true);
        setBooleanField(term8361, term8361.getClass(), "formatAsBlock", true);
        setBooleanField(term8361, term8361.getClass(), "canContainBlock", false);
        setBooleanField(term8361, term8361.getClass(), "canContainInline", true);
        setBooleanField(term8361, term8361.getClass(), "empty", false);
        setBooleanField(term8361, term8361.getClass(), "selfClosing", false);
        setBooleanField(term8361, term8361.getClass(), "preserveWhitespace", false);
        setBooleanField(term8361, term8361.getClass(), "formList", false);
        setBooleanField(term8361, term8361.getClass(), "formSubmit", false);
        setField(term8360, term8360.getClass(), "tag", term8361);
        setField(term8360, term8360.getClass(), "classNames", term8383);
        setField(term8360, term8360.getClass(), "parentNode", null);
        setField(term8360, term8360.getClass(), "childNodes", term8394);
        setField(term8398, term8398.getClass(), "attributes", term8399);
        setField(term8360, term8360.getClass(), "attributes", term8398);
        setField(term8360, term8360.getClass(), "baseUri", "KDdRNhZmnU");
        setIntField(term8360, term8360.getClass(), "siblingIndex", 1557431527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term8360, args);
    }

};


