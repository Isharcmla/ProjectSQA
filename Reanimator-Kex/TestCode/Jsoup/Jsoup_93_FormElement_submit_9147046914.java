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
import java.util.ArrayList;

public class FormElement_submit_9147046914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448;

    public FormElement_submit_9147046914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term490 = new ArrayList();
        ((ArrayList) term490).add((Object)null);
        ((ArrayList) term490).add((Object)null);
        ((ArrayList) term490).add((Object)null);
        ((ArrayList) term490).add((Object)null);
        ((ArrayList) term490).add((Object)null);
        ((ArrayList) term490).add((Object)null);
        ((ArrayList) term490).add((Object)null);
        term448 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term449 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term450 = (Object[]) newArray("java.lang.Object", 0);
        Object term453 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term486 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term487 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term488 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term494 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term496 = (Object[]) newArray("java.lang.String", 0);
        Object[] term497 = (Object[]) newArray("java.lang.String", 0);
        setField(term449, term449.getClass(), "elementData", term450);
        setIntField(term449, term449.getClass(), "size", 0);
        setIntField(term449, term449.getClass(), "modCount", 0);
        setField(term448, term448.getClass(), "elements", term449);
        setField(term453, term453.getClass(), "tagName", "aJlieCFVtF");
        setField(term453, term453.getClass(), "normalName", "ZiaGIbnzTs");
        setBooleanField(term453, term453.getClass(), "isBlock", false);
        setBooleanField(term453, term453.getClass(), "formatAsBlock", true);
        setBooleanField(term453, term453.getClass(), "canContainInline", true);
        setBooleanField(term453, term453.getClass(), "empty", false);
        setBooleanField(term453, term453.getClass(), "selfClosing", true);
        setBooleanField(term453, term453.getClass(), "preserveWhitespace", true);
        setBooleanField(term453, term453.getClass(), "formList", true);
        setBooleanField(term453, term453.getClass(), "formSubmit", false);
        setField(term448, term448.getClass(), "tag", term453);
        setField(term486, term486.getClass(), "referent", null);
        setField(term487, term487.getClass(), "lock", term488);
        setField(term487, term487.getClass(), "head", null);
        setLongField(term487, term487.getClass(), "queueLength", 5270370404989704783L);
        setField(term486, term486.getClass(), "queue", term487);
        setField(term486, term486.getClass(), "next", null);
        setField(term486, term486.getClass(), "discovered", null);
        setField(term448, term448.getClass(), "shadowChildrenRef", term486);
        setField(term448, term448.getClass(), "childNodes", term490);
        setIntField(term494, term494.getClass(), "size", -1339778481);
        setField(term494, term494.getClass(), "keys", term496);
        setField(term494, term494.getClass(), "vals", term497);
        setField(term448, term448.getClass(), "attributes", term494);
        setField(term448, term448.getClass(), "baseUri", "tbcdzjIfER");
        setField(term448, term448.getClass(), "parentNode", null);
        setIntField(term448, term448.getClass(), "siblingIndex", 1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "submit", argTypes, term448, args);
    }

};


