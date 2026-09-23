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

public class Element_nodelistChanged_1523958946133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;
     Object term59943;

    public Element_nodelistChanged_1523958946133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1615 = new ArrayList();
        ((ArrayList) term1615).add((Object)null);
        term1589 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1590 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1611 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term1612 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term1613 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term1619 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term1621 = (Object[]) newArray("java.lang.String", 0);
        Object[] term1622 = (Object[]) newArray("java.lang.String", 0);
        setField(term1590, term1590.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term1590, term1590.getClass(), "isBlock", false);
        setBooleanField(term1590, term1590.getClass(), "formatAsBlock", true);
        setBooleanField(term1590, term1590.getClass(), "canContainInline", false);
        setBooleanField(term1590, term1590.getClass(), "empty", true);
        setBooleanField(term1590, term1590.getClass(), "selfClosing", true);
        setBooleanField(term1590, term1590.getClass(), "preserveWhitespace", false);
        setBooleanField(term1590, term1590.getClass(), "formList", true);
        setBooleanField(term1590, term1590.getClass(), "formSubmit", true);
        setField(term1589, term1589.getClass(), "tag", term1590);
        setField(term1611, term1611.getClass(), "referent", null);
        setField(term1612, term1612.getClass(), "lock", term1613);
        setField(term1612, term1612.getClass(), "head", null);
        setLongField(term1612, term1612.getClass(), "queueLength", -2585684163342970173L);
        setField(term1611, term1611.getClass(), "queue", term1612);
        setField(term1611, term1611.getClass(), "next", null);
        setField(term1611, term1611.getClass(), "discovered", null);
        setField(term1589, term1589.getClass(), "shadowChildrenRef", term1611);
        setField(term1589, term1589.getClass(), "childNodes", term1615);
        setIntField(term1619, term1619.getClass(), "size", 1876565163);
        setField(term1619, term1619.getClass(), "keys", term1621);
        setField(term1619, term1619.getClass(), "vals", term1622);
        setField(term1589, term1589.getClass(), "attributes", term1619);
        setField(term1589, term1589.getClass(), "baseUri", "JDswTTCZHV");
        setField(term1589, term1589.getClass(), "parentNode", null);
        setIntField(term1589, term1589.getClass(), "siblingIndex", -817164822);
        ArrayList term59947 = new ArrayList();
        ((ArrayList) term59947).add((Object)null);
        term59943 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term59944 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59949 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term59950 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59951 = (Object[]) newArray("java.lang.String", 0);
        setField(term59944, term59944.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term59944, term59944.getClass(), "isBlock", false);
        setBooleanField(term59944, term59944.getClass(), "formatAsBlock", true);
        setBooleanField(term59944, term59944.getClass(), "canContainInline", false);
        setBooleanField(term59944, term59944.getClass(), "empty", true);
        setBooleanField(term59944, term59944.getClass(), "selfClosing", true);
        setBooleanField(term59944, term59944.getClass(), "preserveWhitespace", false);
        setBooleanField(term59944, term59944.getClass(), "formList", true);
        setBooleanField(term59944, term59944.getClass(), "formSubmit", true);
        setField(term59943, term59943.getClass(), "tag", term59944);
        setField(term59943, term59943.getClass(), "shadowChildrenRef", null);
        setField(term59943, term59943.getClass(), "childNodes", term59947);
        setIntField(term59949, term59949.getClass(), "size", 1876565163);
        setField(term59949, term59949.getClass(), "keys", term59950);
        setField(term59949, term59949.getClass(), "vals", term59951);
        setField(term59943, term59943.getClass(), "attributes", term59949);
        setField(term59943, term59943.getClass(), "baseUri", "JDswTTCZHV");
        setField(term59943, term59943.getClass(), "parentNode", null);
        setIntField(term59943, term59943.getClass(), "siblingIndex", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nodelistChanged", argTypes, term1589, args);
        assertTrue(recursiveEquals(term1589, term59943));
    }

};


