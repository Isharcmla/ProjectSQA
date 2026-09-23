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

public class Element_tagName_1715810852118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624;
     Object term10664;

    public Element_tagName_1715810852118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term650 = new ArrayList();
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        ((ArrayList) term650).add((Object)null);
        term624 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term625 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term646 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term647 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term648 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term654 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term656 = (Object[]) newArray("java.lang.String", 0);
        Object[] term657 = (Object[]) newArray("java.lang.String", 0);
        setField(term625, term625.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term625, term625.getClass(), "isBlock", false);
        setBooleanField(term625, term625.getClass(), "formatAsBlock", false);
        setBooleanField(term625, term625.getClass(), "canContainInline", false);
        setBooleanField(term625, term625.getClass(), "empty", true);
        setBooleanField(term625, term625.getClass(), "selfClosing", false);
        setBooleanField(term625, term625.getClass(), "preserveWhitespace", false);
        setBooleanField(term625, term625.getClass(), "formList", true);
        setBooleanField(term625, term625.getClass(), "formSubmit", false);
        setField(term624, term624.getClass(), "tag", term625);
        setField(term646, term646.getClass(), "referent", null);
        setField(term647, term647.getClass(), "lock", term648);
        setField(term647, term647.getClass(), "head", null);
        setLongField(term647, term647.getClass(), "queueLength", 6811161968424632369L);
        setField(term646, term646.getClass(), "queue", term647);
        setField(term646, term646.getClass(), "next", null);
        setField(term646, term646.getClass(), "discovered", null);
        setField(term624, term624.getClass(), "shadowChildrenRef", term646);
        setField(term624, term624.getClass(), "childNodes", term650);
        setIntField(term654, term654.getClass(), "size", 597278769);
        setField(term654, term654.getClass(), "keys", term656);
        setField(term654, term654.getClass(), "vals", term657);
        setField(term624, term624.getClass(), "attributes", term654);
        setField(term624, term624.getClass(), "baseUri", "RkybSrpybU");
        setField(term624, term624.getClass(), "parentNode", null);
        setIntField(term624, term624.getClass(), "siblingIndex", -1685132342);
        ArrayList term10671 = new ArrayList();
        ((ArrayList) term10671).add((Object)null);
        ((ArrayList) term10671).add((Object)null);
        ((ArrayList) term10671).add((Object)null);
        ((ArrayList) term10671).add((Object)null);
        ((ArrayList) term10671).add((Object)null);
        ((ArrayList) term10671).add((Object)null);
        term10664 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10665 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10668 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term10669 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term10670 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term10673 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term10674 = (Object[]) newArray("java.lang.String", 0);
        Object[] term10675 = (Object[]) newArray("java.lang.String", 0);
        setField(term10665, term10665.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term10665, term10665.getClass(), "isBlock", false);
        setBooleanField(term10665, term10665.getClass(), "formatAsBlock", false);
        setBooleanField(term10665, term10665.getClass(), "canContainInline", false);
        setBooleanField(term10665, term10665.getClass(), "empty", true);
        setBooleanField(term10665, term10665.getClass(), "selfClosing", false);
        setBooleanField(term10665, term10665.getClass(), "preserveWhitespace", false);
        setBooleanField(term10665, term10665.getClass(), "formList", true);
        setBooleanField(term10665, term10665.getClass(), "formSubmit", false);
        setField(term10664, term10664.getClass(), "tag", term10665);
        setField(term10668, term10668.getClass(), "referent", null);
        setField(term10669, term10669.getClass(), "lock", term10670);
        setField(term10669, term10669.getClass(), "head", null);
        setLongField(term10669, term10669.getClass(), "queueLength", 6811161968424632369L);
        setField(term10668, term10668.getClass(), "queue", term10669);
        setField(term10668, term10668.getClass(), "next", null);
        setField(term10668, term10668.getClass(), "discovered", null);
        setField(term10664, term10664.getClass(), "shadowChildrenRef", term10668);
        setField(term10664, term10664.getClass(), "childNodes", term10671);
        setIntField(term10673, term10673.getClass(), "size", 597278769);
        setField(term10673, term10673.getClass(), "keys", term10674);
        setField(term10673, term10673.getClass(), "vals", term10675);
        setField(term10664, term10664.getClass(), "attributes", term10673);
        setField(term10664, term10664.getClass(), "baseUri", "RkybSrpybU");
        setField(term10664, term10664.getClass(), "parentNode", null);
        setIntField(term10664, term10664.getClass(), "siblingIndex", -1685132342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tagName", argTypes, term624, args);
        assertTrue(recursiveEquals(term624, term10664));
        assertTrue(recursiveEquals(retValue, "hNxWaHcfhY"));
    }

};


