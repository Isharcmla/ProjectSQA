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
import java.lang.Double;

public class MultiplePiePlot_setLimit_13737502979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1311;
     Object term1440;

    public MultiplePiePlot_setLimit_13737502979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1366 = new ArrayList();
        ArrayList term1410 = new ArrayList();
        term1311 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term1312 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term1313 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term1315 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1316 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term1322 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term1325 = newInstance(Class.forName("java.awt.Font"));
        Object term1336 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term1338 = newInstance(Class.forName("java.awt.Color"));
        Object term1365 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term1370 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term1372 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term1374 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1375 = (Object[]) newArray("java.lang.Object", 0);
        Object term1389 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1394 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term1395 = newInstance(Class.forName("java.awt.Color"));
        Object term1398 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term1405 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term1416 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1417 = (Object[]) newArray("java.lang.Object", 0);
        Object term1418 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term1419 = (Object[]) newArray("java.lang.Object", 0);
        Object term1421 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term1313, term1313.getClass(), "hintmap", null);
        setField(term1312, term1312.getClass(), "renderingHints", term1313);
        setBooleanField(term1312, term1312.getClass(), "borderVisible", true);
        setField(term1312, term1312.getClass(), "borderStroke", null);
        setField(term1312, term1312.getClass(), "borderPaint", null);
        setField(term1316, term1316.getClass(), "name", "");
        setField(term1315, term1315.getClass(), "unitType", term1316);
        setDoubleField(term1315, term1315.getClass(), "top", 1.0);
        setDoubleField(term1315, term1315.getClass(), "left", 1.0);
        setDoubleField(term1315, term1315.getClass(), "bottom", 1.0);
        setDoubleField(term1315, term1315.getClass(), "right", 1.0);
        setField(term1312, term1312.getClass(), "padding", term1315);
        setField(term1322, term1322.getClass(), "text", "");
        setField(term1325, term1325.getClass(), "fRequestedAttributes", null);
        setField(term1325, term1325.getClass(), "name", "");
        setIntField(term1325, term1325.getClass(), "style", 1);
        setIntField(term1325, term1325.getClass(), "size", 12);
        setFloatField(term1325, term1325.getClass(), "pointSize", 12.0F);
        setField(term1325, term1325.getClass(), "peer", null);
        setLongField(term1325, term1325.getClass(), "pData", 0L);
        setField(term1325, term1325.getClass(), "font2DHandle", null);
        setField(term1325, term1325.getClass(), "values", null);
        setBooleanField(term1325, term1325.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term1325, term1325.getClass(), "createdFont", false);
        setBooleanField(term1325, term1325.getClass(), "nonIdentityTx", false);
        setIntField(term1325, term1325.getClass(), "hash", 0);
        setIntField(term1325, term1325.getClass(), "fontSerializedDataVersion", 1);
        setField(term1325, term1325.getClass(), "flmref", null);
        setField(term1322, term1322.getClass(), "font", term1325);
        setField(term1336, term1336.getClass(), "name", "");
        setField(term1322, term1322.getClass(), "textAlignment", term1336);
        setIntField(term1338, term1338.getClass(), "value", -16777216);
        setField(term1338, term1338.getClass(), "frgbvalue", null);
        setField(term1338, term1338.getClass(), "fvalue", null);
        setFloatField(term1338, term1338.getClass(), "falpha", 0.0F);
        setField(term1338, term1338.getClass(), "cs", null);
        setField(term1322, term1322.getClass(), "paint", term1338);
        setField(term1322, term1322.getClass(), "backgroundPaint", null);
        setField(term1322, term1322.getClass(), "toolTipText", "AijpHYOFuy");
        setField(term1322, term1322.getClass(), "urlText", "SbAoxhfrkn");
        setField(term1365, term1365.getClass(), "lines", term1366);
        setField(term1365, term1365.getClass(), "lineAlignment", term1336);
        setField(term1322, term1322.getClass(), "content", term1365);
        setBooleanField(term1322, term1322.getClass(), "expandToFitSpace", false);
        setField(term1370, term1370.getClass(), "name", "");
        setField(term1322, term1322.getClass(), "position", term1370);
        setField(term1322, term1322.getClass(), "horizontalAlignment", term1336);
        setField(term1372, term1372.getClass(), "name", "");
        setField(term1322, term1322.getClass(), "verticalAlignment", term1372);
        setField(term1374, term1374.getClass(), "listenerList", term1375);
        setField(term1322, term1322.getClass(), "listenerList", term1374);
        setBooleanField(term1322, term1322.getClass(), "notify", true);
        setField(term1322, term1322.getClass(), "id", "kuTXqwMtDB");
        setField(term1389, term1389.getClass(), "unitType", term1316);
        setDoubleField(term1389, term1389.getClass(), "top", 0.0);
        setDoubleField(term1389, term1389.getClass(), "left", 0.0);
        setDoubleField(term1389, term1389.getClass(), "bottom", 0.0);
        setDoubleField(term1389, term1389.getClass(), "right", 0.0);
        setField(term1322, term1322.getClass(), "margin", term1389);
        setField(term1394, term1394.getClass(), "insets", term1389);
        setIntField(term1395, term1395.getClass(), "value", -1);
        setField(term1395, term1395.getClass(), "frgbvalue", null);
        setField(term1395, term1395.getClass(), "fvalue", null);
        setFloatField(term1395, term1395.getClass(), "falpha", 0.0F);
        setField(term1395, term1395.getClass(), "cs", null);
        setField(term1394, term1394.getClass(), "paint", term1395);
        setField(term1322, term1322.getClass(), "frame", term1394);
        setField(term1398, term1398.getClass(), "unitType", term1316);
        setDoubleField(term1398, term1398.getClass(), "top", 1.0);
        setDoubleField(term1398, term1398.getClass(), "left", 1.0);
        setDoubleField(term1398, term1398.getClass(), "bottom", 1.0);
        setDoubleField(term1398, term1398.getClass(), "right", 1.0);
        setField(term1322, term1322.getClass(), "padding", term1398);
        setDoubleField(term1322, term1322.getClass(), "width", 0.7633268466829064);
        setDoubleField(term1322, term1322.getClass(), "height", 0.13481025392611334);
        setFloatField(term1405, term1405.getClass(), "x", 0.0F);
        setFloatField(term1405, term1405.getClass(), "y", 0.0F);
        setFloatField(term1405, term1405.getClass(), "width", 0.0F);
        setFloatField(term1405, term1405.getClass(), "height", 0.0F);
        setField(term1322, term1322.getClass(), "bounds", term1405);
        setField(term1312, term1312.getClass(), "title", term1322);
        setField(term1312, term1312.getClass(), "subtitles", term1410);
        setField(term1312, term1312.getClass(), "plot", null);
        setField(term1312, term1312.getClass(), "backgroundPaint", null);
        setField(term1312, term1312.getClass(), "backgroundImage", null);
        setIntField(term1312, term1312.getClass(), "backgroundImageAlignment", 1227103734);
        setFloatField(term1312, term1312.getClass(), "backgroundImageAlpha", 0.2857073F);
        setField(term1416, term1416.getClass(), "listenerList", term1417);
        setField(term1312, term1312.getClass(), "changeListeners", term1416);
        setField(term1418, term1418.getClass(), "listenerList", term1419);
        setField(term1312, term1312.getClass(), "progressListeners", term1418);
        setBooleanField(term1312, term1312.getClass(), "notify", false);
        setField(term1311, term1311.getClass(), "pieChart", term1312);
        setField(term1311, term1311.getClass(), "dataset", null);
        setField(term1421, term1421.getClass(), "name", "Ghbwtircqb");
        setField(term1311, term1311.getClass(), "dataExtractOrder", term1421);
        setDoubleField(term1311, term1311.getClass(), "limit", 0.3800088629986428);
        setField(term1311, term1311.getClass(), "aggregatedItemsKey", null);
        setField(term1311, term1311.getClass(), "aggregatedItemsPaint", null);
        setField(term1311, term1311.getClass(), "sectionPaints", null);
        setField(term1311, term1311.getClass(), "parent", null);
        setField(term1311, term1311.getClass(), "datasetGroup", null);
        setField(term1311, term1311.getClass(), "noDataMessage", null);
        setField(term1311, term1311.getClass(), "noDataMessageFont", null);
        setField(term1311, term1311.getClass(), "noDataMessagePaint", null);
        setField(term1311, term1311.getClass(), "insets", null);
        setBooleanField(term1311, term1311.getClass(), "outlineVisible", false);
        setField(term1311, term1311.getClass(), "outlineStroke", null);
        setField(term1311, term1311.getClass(), "outlinePaint", null);
        setField(term1311, term1311.getClass(), "backgroundPaint", null);
        setField(term1311, term1311.getClass(), "backgroundImage", null);
        setIntField(term1311, term1311.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term1311, term1311.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term1311, term1311.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term1311, term1311.getClass(), "backgroundAlpha", 0.0F);
        setField(term1311, term1311.getClass(), "drawingSupplier", null);
        setField(term1311, term1311.getClass(), "listenerList", null);
        term1440 = new Double(0.5840714198152577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term1440;
        callMethod(klass, "setLimit", argTypes, term1311, args);
    }

};


