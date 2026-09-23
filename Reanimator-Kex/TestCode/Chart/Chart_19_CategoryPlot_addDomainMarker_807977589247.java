package org.jfree.chart.plot;

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
import java.lang.NoClassDefFoundError;
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CategoryPlot_addDomainMarker_807977589247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2513;

    public CategoryPlot_addDomainMarker_807977589247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2513 = newInstance(Class.forName("org.jfree.chart.plot.CategoryMarker"));
        Object term2528 = newInstance(Class.forName("java.awt.Font"));
        Object term2529 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2530 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2531 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setField(term2513, term2513.getClass(), "key", null);
        setBooleanField(term2513, term2513.getClass(), "drawAsLine", true);
        setField(term2513, term2513.getClass(), "paint", null);
        setField(term2513, term2513.getClass(), "stroke", null);
        setField(term2513, term2513.getClass(), "outlinePaint", null);
        setField(term2513, term2513.getClass(), "outlineStroke", null);
        setFloatField(term2513, term2513.getClass(), "alpha", 0.7254646F);
        setField(term2513, term2513.getClass(), "label", "LvtrsXUliU");
        setIntField(term2531, term2531.getClass(), "hash", 1036096479);
        setField(term2531, term2531.getClass(), "key", null);
        setField(term2531, term2531.getClass(), "value", null);
        setField(term2531, term2531.getClass(), "next", null);
        setElement(term2530, 0, term2531);
        setField(term2529, term2529.getClass(), "table", term2530);
        setIntField(term2529, term2529.getClass(), "count", 1);
        setIntField(term2529, term2529.getClass(), "threshold", 8);
        setFloatField(term2529, term2529.getClass(), "loadFactor", 0.75F);
        setIntField(term2529, term2529.getClass(), "modCount", 1);
        setField(term2529, term2529.getClass(), "keySet", null);
        setField(term2529, term2529.getClass(), "entrySet", null);
        setField(term2529, term2529.getClass(), "values", null);
        setField(term2528, term2528.getClass(), "fRequestedAttributes", term2529);
        setField(term2528, term2528.getClass(), "name", "xLbjWUgOIL");
        setIntField(term2528, term2528.getClass(), "style", -1179120542);
        setIntField(term2528, term2528.getClass(), "size", -73683645);
        setFloatField(term2528, term2528.getClass(), "pointSize", 0.9828442F);
        setField(term2528, term2528.getClass(), "peer", null);
        setLongField(term2528, term2528.getClass(), "pData", 0L);
        setField(term2528, term2528.getClass(), "font2DHandle", null);
        setField(term2528, term2528.getClass(), "values", null);
        setBooleanField(term2528, term2528.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2528, term2528.getClass(), "createdFont", false);
        setBooleanField(term2528, term2528.getClass(), "nonIdentityTx", false);
        setIntField(term2528, term2528.getClass(), "hash", 0);
        setIntField(term2528, term2528.getClass(), "fontSerializedDataVersion", 0);
        setField(term2528, term2528.getClass(), "flmref", null);
        setField(term2513, term2513.getClass(), "labelFont", term2528);
        setField(term2513, term2513.getClass(), "labelPaint", null);
        setField(term2513, term2513.getClass(), "labelAnchor", null);
        setField(term2513, term2513.getClass(), "labelTextAnchor", null);
        setField(term2513, term2513.getClass(), "labelOffset", null);
        setField(term2513, term2513.getClass(), "labelOffsetType", null);
        setField(term2513, term2513.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jfree.chart.plot.CategoryMarker");
        Object[] args = new Object[1];
        args[0] = term2513;
        try {
            callMethod(klass, "addDomainMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


