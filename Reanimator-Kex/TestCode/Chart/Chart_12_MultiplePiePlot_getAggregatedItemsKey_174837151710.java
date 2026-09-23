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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MultiplePiePlot_getAggregatedItemsKey_174837151710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;

    public MultiplePiePlot_getAggregatedItemsKey_174837151710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1537 = new ArrayList();
        ArrayList term1581 = new ArrayList();
        term1482 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term1483 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1484 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1486 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1487 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1493 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1496 = newInstance(Class.forName("java.awt.Font"));
        Object term1507 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1509 = newInstance(Class.forName("java.awt.Color"));
        Object term1536 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1541 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1543 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1545 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1546 = (Object[]) newArray("java.lang.Object", 0);
        Object term1560 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1565 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1566 = newInstance(Class.forName("java.awt.Color"));
        Object term1569 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1576 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1587 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1588 = (Object[]) newArray("java.lang.Object", 0);
        Object term1589 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1590 = (Object[]) newArray("java.lang.Object", 0);
        Object term1592 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1484, term1484.getClass(), "hintmap", null);
        setField(term1483, term1483.getClass(), "renderingHints", term1484);
        setBooleanField(term1483, term1483.getClass(), "borderVisible", false);
        setField(term1483, term1483.getClass(), "borderStroke", null);
        setField(term1483, term1483.getClass(), "borderPaint", null);
        setField(term1487, term1487.getClass(), "name", "");
        setField(term1486, term1486.getClass(), "unitType", term1487);
        setDoubleField(term1486, term1486.getClass(), "top", 1.0);
        setDoubleField(term1486, term1486.getClass(), "left", 1.0);
        setDoubleField(term1486, term1486.getClass(), "bottom", 1.0);
        setDoubleField(term1486, term1486.getClass(), "right", 1.0);
        setField(term1483, term1483.getClass(), "padding", term1486);
        setField(term1493, term1493.getClass(), "text", "");
        setField(term1496, term1496.getClass(), "fRequestedAttributes", null);
        setField(term1496, term1496.getClass(), "name", "");
        setIntField(term1496, term1496.getClass(), "style", 1);
        setIntField(term1496, term1496.getClass(), "size", 12);
        setFloatField(term1496, term1496.getClass(), "pointSize", 12.0F);
        setField(term1496, term1496.getClass(), "peer", null);
        setLongField(term1496, term1496.getClass(), "pData", 0L);
        setField(term1496, term1496.getClass(), "font2DHandle", null);
        setField(term1496, term1496.getClass(), "values", null);
        setBooleanField(term1496, term1496.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1496, term1496.getClass(), "createdFont", false);
        setBooleanField(term1496, term1496.getClass(), "nonIdentityTx", false);
        setIntField(term1496, term1496.getClass(), "hash", 0);
        setIntField(term1496, term1496.getClass(), "fontSerializedDataVersion", 1);
        setField(term1496, term1496.getClass(), "flmref", null);
        setField(term1493, term1493.getClass(), "font", term1496);
        setField(term1507, term1507.getClass(), "name", "");
        setField(term1493, term1493.getClass(), "textAlignment", term1507);
        setIntField(term1509, term1509.getClass(), "value", -16777216);
        setField(term1509, term1509.getClass(), "frgbvalue", null);
        setField(term1509, term1509.getClass(), "fvalue", null);
        setFloatField(term1509, term1509.getClass(), "falpha", 0.0F);
        setField(term1509, term1509.getClass(), "cs", null);
        setField(term1493, term1493.getClass(), "paint", term1509);
        setField(term1493, term1493.getClass(), "backgroundPaint", null);
        setField(term1493, term1493.getClass(), "toolTipText", "xrwlQZdwCp");
        setField(term1493, term1493.getClass(), "urlText", "IDCWpPLRkE");
        setField(term1536, term1536.getClass(), "lines", term1537);
        setField(term1536, term1536.getClass(), "lineAlignment", term1507);
        setField(term1493, term1493.getClass(), "content", term1536);
        setBooleanField(term1493, term1493.getClass(), "expandToFitSpace", true);
        setField(term1541, term1541.getClass(), "name", "");
        setField(term1493, term1493.getClass(), "position", term1541);
        setField(term1493, term1493.getClass(), "horizontalAlignment", term1507);
        setField(term1543, term1543.getClass(), "name", "");
        setField(term1493, term1493.getClass(), "verticalAlignment", term1543);
        setField(term1545, term1545.getClass(), "listenerList", term1546);
        setField(term1493, term1493.getClass(), "listenerList", term1545);
        setBooleanField(term1493, term1493.getClass(), "notify", true);
        setField(term1493, term1493.getClass(), "id", "nyiiPDVjAc");
        setField(term1560, term1560.getClass(), "unitType", term1487);
        setDoubleField(term1560, term1560.getClass(), "top", 0.0);
        setDoubleField(term1560, term1560.getClass(), "left", 0.0);
        setDoubleField(term1560, term1560.getClass(), "bottom", 0.0);
        setDoubleField(term1560, term1560.getClass(), "right", 0.0);
        setField(term1493, term1493.getClass(), "margin", term1560);
        setField(term1565, term1565.getClass(), "insets", term1560);
        setIntField(term1566, term1566.getClass(), "value", -1);
        setField(term1566, term1566.getClass(), "frgbvalue", null);
        setField(term1566, term1566.getClass(), "fvalue", null);
        setFloatField(term1566, term1566.getClass(), "falpha", 0.0F);
        setField(term1566, term1566.getClass(), "cs", null);
        setField(term1565, term1565.getClass(), "paint", term1566);
        setField(term1493, term1493.getClass(), "frame", term1565);
        setField(term1569, term1569.getClass(), "unitType", term1487);
        setDoubleField(term1569, term1569.getClass(), "top", 1.0);
        setDoubleField(term1569, term1569.getClass(), "left", 1.0);
        setDoubleField(term1569, term1569.getClass(), "bottom", 1.0);
        setDoubleField(term1569, term1569.getClass(), "right", 1.0);
        setField(term1493, term1493.getClass(), "padding", term1569);
        setDoubleField(term1493, term1493.getClass(), "width", 0.7559240768573477);
        setDoubleField(term1493, term1493.getClass(), "height", 0.10667076642995188);
        setFloatField(term1576, term1576.getClass(), "x", 0.0F);
        setFloatField(term1576, term1576.getClass(), "y", 0.0F);
        setFloatField(term1576, term1576.getClass(), "width", 0.0F);
        setFloatField(term1576, term1576.getClass(), "height", 0.0F);
        setField(term1493, term1493.getClass(), "bounds", term1576);
        setField(term1483, term1483.getClass(), "title", term1493);
        setField(term1483, term1483.getClass(), "subtitles", term1581);
        setField(term1483, term1483.getClass(), "plot", null);
        setField(term1483, term1483.getClass(), "backgroundPaint", null);
        setField(term1483, term1483.getClass(), "backgroundImage", null);
        setIntField(term1483, term1483.getClass(), "backgroundImageAlignment", -1339778481);
        setFloatField(term1483, term1483.getClass(), "backgroundImageAlpha", 0.6880585F);
        setField(term1587, term1587.getClass(), "listenerList", term1588);
        setField(term1483, term1483.getClass(), "changeListeners", term1587);
        setField(term1589, term1589.getClass(), "listenerList", term1590);
        setField(term1483, term1483.getClass(), "progressListeners", term1589);
        setBooleanField(term1483, term1483.getClass(), "notify", true);
        setField(term1482, term1482.getClass(), "pieChart", term1483);
        setField(term1482, term1482.getClass(), "dataset", null);
        setField(term1592, term1592.getClass(), "name", "aKnKipADSo");
        setField(term1482, term1482.getClass(), "dataExtractOrder", term1592);
        setDoubleField(term1482, term1482.getClass(), "limit", 0.11493000848982304);
        setField(term1482, term1482.getClass(), "aggregatedItemsKey", null);
        setField(term1482, term1482.getClass(), "aggregatedItemsPaint", null);
        setField(term1482, term1482.getClass(), "sectionPaints", null);
        setField(term1482, term1482.getClass(), "parent", null);
        setField(term1482, term1482.getClass(), "datasetGroup", null);
        setField(term1482, term1482.getClass(), "noDataMessage", null);
        setField(term1482, term1482.getClass(), "noDataMessageFont", null);
        setField(term1482, term1482.getClass(), "noDataMessagePaint", null);
        setField(term1482, term1482.getClass(), "insets", null);
        setBooleanField(term1482, term1482.getClass(), "outlineVisible", false);
        setField(term1482, term1482.getClass(), "outlineStroke", null);
        setField(term1482, term1482.getClass(), "outlinePaint", null);
        setField(term1482, term1482.getClass(), "backgroundPaint", null);
        setField(term1482, term1482.getClass(), "backgroundImage", null);
        setIntField(term1482, term1482.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term1482, term1482.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term1482, term1482.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term1482, term1482.getClass(), "backgroundAlpha", 0.0F);
        setField(term1482, term1482.getClass(), "drawingSupplier", null);
        setField(term1482, term1482.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAggregatedItemsKey", argTypes, term1482, args);
    }

};


