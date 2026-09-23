package org.jsoup.safety;

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
import static org.jsoup.safety.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.safety.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Cleaner_createSafeElement_5064628049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1458;
     Object term1482;
     Object term6039;
     Object term6042;
     Object term5973;

    public Cleaner_createSafeElement_5064628049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1461 = new HashMap();
        Set<Object> term6052 =  ((Map) term1461).keySet();
        HashSet term1460 = new HashSet((Collection<? extends Object>) term6052);
        HashMap term1466 = new HashMap();
        HashMap term1471 = new HashMap();
        HashMap term1476 = new HashMap();
        term1458 = newInstance(Class.forName("org.jsoup.safety.Cleaner"));
        Object term1459 = newInstance(Class.forName("org.jsoup.safety.Whitelist"));
        setField(term1459, term1459.getClass(), "tagNames", term1460);
        setField(term1459, term1459.getClass(), "attributes", term1466);
        setField(term1459, term1459.getClass(), "enforcedAttributes", term1471);
        setField(term1459, term1459.getClass(), "protocols", term1476);
        setBooleanField(term1459, term1459.getClass(), "preserveRelativeLinks", true);
        setField(term1458, term1458.getClass(), "whitelist", term1459);
        ArrayList term1505 = new ArrayList();
        ((ArrayList) term1505).add((Object)null);
        LinkedHashMap term1510 = new LinkedHashMap();
        term1482 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1483 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1509 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1483, term1483.getClass(), "tagName", "xOEqzGAmDU");
        setBooleanField(term1483, term1483.getClass(), "isBlock", true);
        setBooleanField(term1483, term1483.getClass(), "formatAsBlock", false);
        setBooleanField(term1483, term1483.getClass(), "canContainBlock", true);
        setBooleanField(term1483, term1483.getClass(), "canContainInline", false);
        setBooleanField(term1483, term1483.getClass(), "empty", false);
        setBooleanField(term1483, term1483.getClass(), "selfClosing", true);
        setBooleanField(term1483, term1483.getClass(), "preserveWhitespace", false);
        setBooleanField(term1483, term1483.getClass(), "formList", true);
        setBooleanField(term1483, term1483.getClass(), "formSubmit", false);
        setField(term1482, term1482.getClass(), "tag", term1483);
        setField(term1482, term1482.getClass(), "parentNode", null);
        setField(term1482, term1482.getClass(), "childNodes", term1505);
        setField(term1509, term1509.getClass(), "attributes", term1510);
        setField(term1482, term1482.getClass(), "attributes", term1509);
        setField(term1482, term1482.getClass(), "baseUri", "flxyYxBRtu");
        setIntField(term1482, term1482.getClass(), "siblingIndex", -1955890973);
        term6039 = newInstance(Class.forName("org.jsoup.safety.Whitelist$TagName"));
        setField(term6039, term6039.getClass(), "value", "xOEqzGAmDU");
        ArrayList term6046 = new ArrayList();
        ((ArrayList) term6046).add((Object)null);
        LinkedHashMap term6049 = new LinkedHashMap();
        term6042 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6043 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6048 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6043, term6043.getClass(), "tagName", "xOEqzGAmDU");
        setBooleanField(term6043, term6043.getClass(), "isBlock", true);
        setBooleanField(term6043, term6043.getClass(), "formatAsBlock", false);
        setBooleanField(term6043, term6043.getClass(), "canContainBlock", true);
        setBooleanField(term6043, term6043.getClass(), "canContainInline", false);
        setBooleanField(term6043, term6043.getClass(), "empty", false);
        setBooleanField(term6043, term6043.getClass(), "selfClosing", true);
        setBooleanField(term6043, term6043.getClass(), "preserveWhitespace", false);
        setBooleanField(term6043, term6043.getClass(), "formList", true);
        setBooleanField(term6043, term6043.getClass(), "formSubmit", false);
        setField(term6042, term6042.getClass(), "tag", term6043);
        setField(term6042, term6042.getClass(), "parentNode", null);
        setField(term6042, term6042.getClass(), "childNodes", term6046);
        setField(term6048, term6048.getClass(), "attributes", term6049);
        setField(term6042, term6042.getClass(), "attributes", term6048);
        setField(term6042, term6042.getClass(), "baseUri", "flxyYxBRtu");
        setIntField(term6042, term6042.getClass(), "siblingIndex", -1955890973);
        term5973 = newInstance(Class.forName("org.jsoup.safety.Cleaner$ElementMeta"));
        Object term5974 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5975 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5997 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term5999 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5975, term5975.getClass(), "tagName", "xOEqzGAmDU");
        setBooleanField(term5975, term5975.getClass(), "isBlock", false);
        setBooleanField(term5975, term5975.getClass(), "formatAsBlock", true);
        setBooleanField(term5975, term5975.getClass(), "canContainBlock", true);
        setBooleanField(term5975, term5975.getClass(), "canContainInline", true);
        setBooleanField(term5975, term5975.getClass(), "empty", false);
        setBooleanField(term5975, term5975.getClass(), "selfClosing", false);
        setBooleanField(term5975, term5975.getClass(), "preserveWhitespace", false);
        setBooleanField(term5975, term5975.getClass(), "formList", false);
        setBooleanField(term5975, term5975.getClass(), "formSubmit", false);
        setField(term5974, term5974.getClass(), "tag", term5975);
        setField(term5974, term5974.getClass(), "parentNode", null);
        setIntField(term5997, term5997.getClass(), "modCount", 0);
        setField(term5974, term5974.getClass(), "childNodes", term5997);
        setField(term5999, term5999.getClass(), "attributes", null);
        setField(term5974, term5974.getClass(), "attributes", term5999);
        setField(term5974, term5974.getClass(), "baseUri", "flxyYxBRtu");
        setIntField(term5974, term5974.getClass(), "siblingIndex", 0);
        setField(term5973, term5973.getClass(), "el", term5974);
        setIntField(term5973, term5973.getClass(), "numAttribsDiscarded", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.safety.Cleaner");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term1482;
        Object retValue = callMethod(klass, "createSafeElement", argTypes, term1458, args);
        assertTrue(recursiveEquals(term1458, term6039));
        assertTrue(recursiveEquals(term1482, term6042));
        assertTrue(recursiveEquals(retValue, term5973));
    }

};


