package org.jsoup.select;

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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.select.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Selector_indexLessThan_196669213145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1602;

    public Selector_indexLessThan_196669213145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1626 = new ArrayList();
        ((ArrayList) term1626).add((Object)null);
        ((ArrayList) term1626).add((Object)null);
        ((ArrayList) term1626).add((Object)null);
        ((ArrayList) term1626).add((Object)null);
        ((ArrayList) term1626).add((Object)null);
        ((ArrayList) term1626).add((Object)null);
        ((ArrayList) term1626).add((Object)null);
        ArrayList term1630 = new ArrayList();
        ((ArrayList) term1630).add((Object)null);
        ((ArrayList) term1630).add((Object)null);
        ((ArrayList) term1630).add((Object)null);
        ((ArrayList) term1630).add((Object)null);
        ((ArrayList) term1630).add((Object)null);
        ArrayList term1634 = new ArrayList();
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        ((ArrayList) term1634).add((Object)null);
        HashMap term1641 = new HashMap();
        Set<Object> term7914 =  ((Map) term1641).keySet();
        HashSet term1640 = new HashSet((Collection<? extends Object>) term7914);
        ArrayList term1647 = new ArrayList();
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        ((ArrayList) term1647).add((Object)null);
        LinkedHashMap term1652 = new LinkedHashMap();
        LinkedHashMap term1672 = new LinkedHashMap();
        Set<Object> term7925 =  ((Map) term1672).keySet();
        LinkedHashSet term1671 = new LinkedHashSet((Collection<? extends Object>) term7925);
        term1602 = newInstance(Class.forName("org.jsoup.select.Selector"));
        Object term1603 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1604 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1651 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term1698 = newInstance(Class.forName("org.jsoup.parser.TokenQueue"));
        setField(term1604, term1604.getClass(), "tagName", "sHMXNUzNeM");
        setBooleanField(term1604, term1604.getClass(), "knownTag", false);
        setBooleanField(term1604, term1604.getClass(), "isBlock", false);
        setBooleanField(term1604, term1604.getClass(), "formatAsBlock", true);
        setBooleanField(term1604, term1604.getClass(), "canContainBlock", false);
        setBooleanField(term1604, term1604.getClass(), "canContainInline", true);
        setBooleanField(term1604, term1604.getClass(), "optionalClosing", true);
        setBooleanField(term1604, term1604.getClass(), "empty", true);
        setBooleanField(term1604, term1604.getClass(), "selfClosing", true);
        setBooleanField(term1604, term1604.getClass(), "preserveWhitespace", false);
        setField(term1604, term1604.getClass(), "ancestors", term1626);
        setField(term1604, term1604.getClass(), "excludes", term1630);
        setField(term1604, term1604.getClass(), "ignoreEndTags", term1634);
        setBooleanField(term1604, term1604.getClass(), "directDescendant", false);
        setBooleanField(term1604, term1604.getClass(), "limitChildren", true);
        setField(term1603, term1603.getClass(), "tag", term1604);
        setField(term1603, term1603.getClass(), "classNames", term1640);
        setField(term1603, term1603.getClass(), "parentNode", null);
        setField(term1603, term1603.getClass(), "childNodes", term1647);
        setField(term1651, term1651.getClass(), "attributes", term1652);
        setField(term1603, term1603.getClass(), "attributes", term1651);
        setField(term1603, term1603.getClass(), "baseUri", "VSaNnhMpRc");
        setIntField(term1603, term1603.getClass(), "siblingIndex", 1596070772);
        setField(term1602, term1602.getClass(), "root", term1603);
        setField(term1602, term1602.getClass(), "elements", term1671);
        setField(term1602, term1602.getClass(), "query", "AGXoIndFnm");
        setField(term1698, term1698.getClass(), "queue", "mwmFMNEzkK");
        setIntField(term1698, term1698.getClass(), "pos", -2095575670);
        setField(term1602, term1602.getClass(), "tq", term1698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.select.Selector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "indexLessThan", argTypes, term1602, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


