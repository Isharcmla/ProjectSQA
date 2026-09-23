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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeStarting_705110720136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4018;
     Object term23674;
     Object term23669;

    public Element_getElementsByAttributeStarting_705110720136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4042 = new HashMap();
        Set<Object> term23699 =  ((Map) term4042).keySet();
        HashSet term4041 = new HashSet((Collection<? extends Object>) term23699);
        ArrayList term4047 = new ArrayList();
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        ((ArrayList) term4047).add((Object)null);
        LinkedHashMap term4052 = new LinkedHashMap();
        term4018 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4019 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4051 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4019, term4019.getClass(), "tagName", "MnovcqFhCl");
        setBooleanField(term4019, term4019.getClass(), "isBlock", false);
        setBooleanField(term4019, term4019.getClass(), "formatAsBlock", false);
        setBooleanField(term4019, term4019.getClass(), "canContainBlock", false);
        setBooleanField(term4019, term4019.getClass(), "canContainInline", false);
        setBooleanField(term4019, term4019.getClass(), "empty", true);
        setBooleanField(term4019, term4019.getClass(), "selfClosing", true);
        setBooleanField(term4019, term4019.getClass(), "preserveWhitespace", true);
        setBooleanField(term4019, term4019.getClass(), "formList", true);
        setBooleanField(term4019, term4019.getClass(), "formSubmit", false);
        setField(term4018, term4018.getClass(), "tag", term4019);
        setField(term4018, term4018.getClass(), "classNames", term4041);
        setField(term4018, term4018.getClass(), "parentNode", null);
        setField(term4018, term4018.getClass(), "childNodes", term4047);
        setField(term4051, term4051.getClass(), "attributes", term4052);
        setField(term4018, term4018.getClass(), "attributes", term4051);
        setField(term4018, term4018.getClass(), "baseUri", "GGzwMoHZXC");
        setIntField(term4018, term4018.getClass(), "siblingIndex", 1876565163);
        HashMap term23679 = new HashMap();
        Set<Object> term23730 =  ((Map) term23679).keySet();
        HashSet term23678 = new HashSet((Collection<? extends Object>) term23730);
        ArrayList term23680 = new ArrayList();
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        ((ArrayList) term23680).add((Object)null);
        LinkedHashMap term23683 = new LinkedHashMap();
        term23674 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23675 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23682 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23675, term23675.getClass(), "tagName", "MnovcqFhCl");
        setBooleanField(term23675, term23675.getClass(), "isBlock", false);
        setBooleanField(term23675, term23675.getClass(), "formatAsBlock", false);
        setBooleanField(term23675, term23675.getClass(), "canContainBlock", false);
        setBooleanField(term23675, term23675.getClass(), "canContainInline", false);
        setBooleanField(term23675, term23675.getClass(), "empty", true);
        setBooleanField(term23675, term23675.getClass(), "selfClosing", true);
        setBooleanField(term23675, term23675.getClass(), "preserveWhitespace", true);
        setBooleanField(term23675, term23675.getClass(), "formList", true);
        setBooleanField(term23675, term23675.getClass(), "formSubmit", false);
        setField(term23674, term23674.getClass(), "tag", term23675);
        setField(term23674, term23674.getClass(), "classNames", term23678);
        setField(term23674, term23674.getClass(), "parentNode", null);
        setField(term23674, term23674.getClass(), "childNodes", term23680);
        setField(term23682, term23682.getClass(), "attributes", term23683);
        setField(term23674, term23674.getClass(), "attributes", term23682);
        setField(term23674, term23674.getClass(), "baseUri", "GGzwMoHZXC");
        setIntField(term23674, term23674.getClass(), "siblingIndex", 1876565163);
        ArrayList term23670 = new ArrayList();
        term23669 = newInstance(Class.forName("org.jsoup.select.Elements"));
        setField(term23669, term23669.getClass(), "contents", term23670);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IpmgwHTgnG";
        Object retValue = callMethod(klass, "getElementsByAttributeStarting", argTypes, term4018, args);
        assertTrue(recursiveEquals(term4018, term23674));
        assertTrue(recursiveEquals(retValue, term23669));
    }

};


