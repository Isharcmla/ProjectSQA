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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Element_data_1210266807119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5705;
     Object term50453;

    public Element_data_1210266807119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5727 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5727, term5727.getClass(), "tagName", null);
        setBooleanField(term5727, term5727.getClass(), "isBlock", false);
        setBooleanField(term5727, term5727.getClass(), "canContainBlock", true);
        setBooleanField(term5727, term5727.getClass(), "canContainInline", true);
        setBooleanField(term5727, term5727.getClass(), "optionalClosing", true);
        setBooleanField(term5727, term5727.getClass(), "empty", false);
        setBooleanField(term5727, term5727.getClass(), "preserveWhitespace", true);
        setField(term5727, term5727.getClass(), "ancestors", null);
        Object term5734 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5734, term5734.getClass(), "tagName", null);
        setBooleanField(term5734, term5734.getClass(), "isBlock", true);
        setBooleanField(term5734, term5734.getClass(), "canContainBlock", true);
        setBooleanField(term5734, term5734.getClass(), "canContainInline", false);
        setBooleanField(term5734, term5734.getClass(), "optionalClosing", false);
        setBooleanField(term5734, term5734.getClass(), "empty", true);
        setBooleanField(term5734, term5734.getClass(), "preserveWhitespace", true);
        setField(term5734, term5734.getClass(), "ancestors", null);
        ArrayList term5725 = new ArrayList();
        ((ArrayList) term5725).add(term5727);
        ((ArrayList) term5725).add(term5734);
        HashMap term5744 = new HashMap();
        Set<Object> term50479 =  ((Map) term5744).keySet();
        HashSet term5743 = new HashSet((Collection<? extends Object>) term50479);
        ArrayList term5760 = new ArrayList();
        LinkedHashMap term5765 = new LinkedHashMap();
        term5705 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5706 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5764 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5706, term5706.getClass(), "tagName", "FlxVmiMYKP");
        setBooleanField(term5706, term5706.getClass(), "isBlock", false);
        setBooleanField(term5706, term5706.getClass(), "canContainBlock", true);
        setBooleanField(term5706, term5706.getClass(), "canContainInline", false);
        setBooleanField(term5706, term5706.getClass(), "optionalClosing", false);
        setBooleanField(term5706, term5706.getClass(), "empty", true);
        setBooleanField(term5706, term5706.getClass(), "preserveWhitespace", true);
        setField(term5706, term5706.getClass(), "ancestors", term5725);
        setField(term5705, term5705.getClass(), "tag", term5706);
        setField(term5705, term5705.getClass(), "classNames", term5743);
        setField(term5705, term5705.getClass(), "parentNode", null);
        setField(term5705, term5705.getClass(), "childNodes", term5760);
        setField(term5764, term5764.getClass(), "attributes", term5765);
        setField(term5705, term5705.getClass(), "attributes", term5764);
        setField(term5705, term5705.getClass(), "baseUri", "TKOMaGswbU");
        Object term50459 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50459, term50459.getClass(), "tagName", null);
        setBooleanField(term50459, term50459.getClass(), "isBlock", false);
        setBooleanField(term50459, term50459.getClass(), "canContainBlock", true);
        setBooleanField(term50459, term50459.getClass(), "canContainInline", true);
        setBooleanField(term50459, term50459.getClass(), "optionalClosing", true);
        setBooleanField(term50459, term50459.getClass(), "empty", false);
        setBooleanField(term50459, term50459.getClass(), "preserveWhitespace", true);
        setField(term50459, term50459.getClass(), "ancestors", null);
        Object term50460 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50460, term50460.getClass(), "tagName", null);
        setBooleanField(term50460, term50460.getClass(), "isBlock", true);
        setBooleanField(term50460, term50460.getClass(), "canContainBlock", true);
        setBooleanField(term50460, term50460.getClass(), "canContainInline", false);
        setBooleanField(term50460, term50460.getClass(), "optionalClosing", false);
        setBooleanField(term50460, term50460.getClass(), "empty", true);
        setBooleanField(term50460, term50460.getClass(), "preserveWhitespace", true);
        setField(term50460, term50460.getClass(), "ancestors", null);
        ArrayList term50457 = new ArrayList();
        ((ArrayList) term50457).add(term50459);
        ((ArrayList) term50457).add(term50460);
        HashMap term50462 = new HashMap();
        Set<Object> term50500 =  ((Map) term50462).keySet();
        HashSet term50461 = new HashSet((Collection<? extends Object>) term50500);
        ArrayList term50463 = new ArrayList();
        LinkedHashMap term50466 = new LinkedHashMap();
        term50453 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term50454 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term50465 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term50454, term50454.getClass(), "tagName", "FlxVmiMYKP");
        setBooleanField(term50454, term50454.getClass(), "isBlock", false);
        setBooleanField(term50454, term50454.getClass(), "canContainBlock", true);
        setBooleanField(term50454, term50454.getClass(), "canContainInline", false);
        setBooleanField(term50454, term50454.getClass(), "optionalClosing", false);
        setBooleanField(term50454, term50454.getClass(), "empty", true);
        setBooleanField(term50454, term50454.getClass(), "preserveWhitespace", true);
        setField(term50454, term50454.getClass(), "ancestors", term50457);
        setField(term50453, term50453.getClass(), "tag", term50454);
        setField(term50453, term50453.getClass(), "classNames", term50461);
        setField(term50453, term50453.getClass(), "parentNode", null);
        setField(term50453, term50453.getClass(), "childNodes", term50463);
        setField(term50465, term50465.getClass(), "attributes", term50466);
        setField(term50453, term50453.getClass(), "attributes", term50465);
        setField(term50453, term50453.getClass(), "baseUri", "TKOMaGswbU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "data", argTypes, term5705, args);
        assertTrue(recursiveEquals(term5705, term50453));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


